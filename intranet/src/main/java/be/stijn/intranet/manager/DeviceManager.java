package be.stijn.intranet.manager;

import org.springframework.stereotype.Service;

import PLCCom.ConnectResult;
import PLCCom.MPI_Device;
import PLCCom.ReadRequest;
import PLCCom.WriteRequest;
import PLCCom.WriteResult;
import PLCCom.authentication;
import PLCCom.eBaudrate;
import PLCCom.ePLCType;
import PLCCom.eRegion;
import PLCCom.eSpeed;


@Service
public class DeviceManager {

	private MPI_Device device = new MPI_Device("/dev/tty.usbserial-FTC8F9JC",
			0, 2, eBaudrate.b38400, eSpeed.Speed187k,
			ePLCType.S7_300_400_compatibel);
	
	public ConnectResult connect() {
		//authentication.Serial("88884-42106-116262-2967058");
		authentication.Serial("89884-35160-117477-2367153");
		authentication.User("Claessens");
		ConnectResult conresult = device.Connect();
		return conresult;
	}
	
	public void disconnect() {
		device.DisConnect();
		// ConnectResult conresult = device.DisConnect();
		// return conresult;
	}
	
	public boolean[] readRequest(eRegion status) {
		try {
			ReadRequest[] oRequestOut = new ReadRequest[1];
			oRequestOut[0] = new ReadRequest();
			oRequestOut[0].setRegion(status);
			oRequestOut[0].setDB(0);
			oRequestOut[0].setStartByte(0);
			oRequestOut[0].setLen(49);
			oRequestOut[0].setBit((byte) 0);
			oRequestOut[0].setIsBit(true);
			return device.read(oRequestOut)[0].Bufferbool();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public void writeRequest(eRegion status, int byteNr, byte bitNr) {
		WriteRequest[] mWriteRequest = new WriteRequest[1];
        mWriteRequest[0] = new WriteRequest();
        mWriteRequest[0].setRegion(status);
        mWriteRequest[0].setStartByte(byteNr);
        mWriteRequest[0].setBit(bitNr);
        mWriteRequest[0].addBit(true);

		WriteResult[] res = device.write(mWriteRequest);
		
		System.out.println(res[0].Message());
	}	
}
