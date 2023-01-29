package amnatariq.org.myquranapplication;

public class UserStudent {
    private String name;
    private String information;
    private String status;

    private int sabak;
    private int sabki;
    private int manzil;

    public UserStudent(String name, String information, String status, int sabak, int sabki, int manzil) {
        this.name = name;
        this.information = information;
        this.status = status;
        this.sabak = sabak;
        this.sabki = sabki;
        this.manzil = manzil;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getSabak() {
        return sabak;
    }

    public void setSabak(int sabak) {
        this.sabak = sabak;
    }

    public int getSabki() {
        return sabki;
    }

    public void setSabki(int sabki) {
        this.sabki = sabki;
    }

    public int getManzil() {
        return manzil;
    }

    public void setManzil(int manzil) {
        this.manzil = manzil;
    }
}

