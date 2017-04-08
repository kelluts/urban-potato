package romaniancoder.booking;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RidesReg {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String lahteKoht;
	private String sihtKoht;
	private String date;
	private long time;
	private int freeSpace;
	private String uhik;
	private String soiduk;
	private String additionalInfo;
    public RidesReg(){}

    public RidesReg(String lahteKoht, String sihtKoht, String date, long time, int freeSpace, String uhik,
			String soiduk, String additionalInfo){
    	
		this.sihtKoht = sihtKoht;
		this.lahteKoht = lahteKoht;
		this.date = date;
		this.time = time;
		this.freeSpace = freeSpace;
		this.uhik = uhik;
		this.soiduk = soiduk;
		this.additionalInfo = additionalInfo;
    }



  
	

	public String getLahteKoht() {
		return lahteKoht;
	}

	public String getSihtKoht() {
		return sihtKoht;
	}

	public String getDate() {
		return date;
	}

	public long getTime() {
		return time;
	}

	public int getFreeSpace() {
		return freeSpace;
	}

	public String getUhik() {
		return uhik;
	}

	public String getSoiduk() {
		return soiduk;
	}

	public String getAdditionalInfo() {
		return additionalInfo;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setLahteKoht(String lahteKoht) {
		this.lahteKoht = lahteKoht;
	}

	public void setSihtKoht(String sihtKoht) {
		this.sihtKoht = sihtKoht;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void setTime(long time) {
		this.time = time;
	}

	public void setFreeSpace(int freeSpace) {
		this.freeSpace = freeSpace;
	}

	public void setUhik(String uhik) {
		this.uhik = uhik;
	}

	public void setSoiduk(String soiduk) {
		this.soiduk = soiduk;
	}

	public void setAdditionalInfo(String additionalInfo) {
		this.additionalInfo = additionalInfo;
	}

	
}
