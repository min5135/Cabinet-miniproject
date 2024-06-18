package cabinet;

public class SeatDTO {
    private String rno;
    private String sno;
    private String state;
    private String id;
    private int period;


    public String getRno() {
        return rno;
    }

    public void setRno(String rno) {
        this.rno = rno;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getPeriod() {
        return period;
    }


    public void setPeriod(String Period) {
        try{
            this.period = Integer.parseInt(Period);
        } catch (NumberFormatException e){

        }


    }

    public void setPeriod(int Period) {
        this.period = Period;
    }

    public SeatDTO() {

    }

}
