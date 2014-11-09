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
	
	public WriteResult writeRequest(eRegion status, byte writeByte, int byteNr) {
		WriteRequest[] oWriteRequest = new WriteRequest[1];
        oWriteRequest[0] = new WriteRequest();
        oWriteRequest[0].setRegion(status);
        oWriteRequest[0].setDB(0);
        //oWriteRequest[0].setStartByte(byteNr);
        oWriteRequest[0].setBit((byte)byteNr);
        oWriteRequest[0].addByte(writeByte);
        
		return device.write(oWriteRequest)[0];
		
		
	}	
}
