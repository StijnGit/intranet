package be.stijn.intranet.maps;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "output")
public class Output{

	@Id @GeneratedValue private long id;
	private String name;
	private int word;
	private int bit;
	private int nr;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWord() {
		return word;
	}

	public void setWord(int word) {
		this.word = word;
	}

	public int getBit() {
		return bit;
	}

	public void setBit(int bit) {
		this.bit = bit;
	}

	public int getNr() {
		return nr;
	}

	public void setNr(int nr) {
		this.nr = nr;
	}

	

}
