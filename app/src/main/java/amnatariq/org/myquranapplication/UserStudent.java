package amnatariq.org.myquranapplication;

public class UserStudent {
    private String name;
    private String information;
    private String status;

    private int sabak;
    private int sabki;
    private int manzil;

    private boolean sabakStatus;
    private boolean sabkiStatus;
    private boolean manzilStatus;

    private String sabakIncorrect;
    private String sabkiIncorrect;
    private String manzilIncorrect;

    public UserStudent(String name, String information, String status, int sabak, int sabki, int manzil, boolean sabakStatus, boolean sabkiStatus, boolean manzilStatus, String sabakIncorrect, String sabkiIncorrect, String manzilIncorrect) {
        this.name = name;
        this.information = information;
        this.status = status;
        this.sabak = sabak;
        this.sabki = sabki;
        this.manzil = manzil;
        this.sabakStatus = sabakStatus;
        this.sabkiStatus = sabkiStatus;
        this.manzilStatus = manzilStatus;
        this.sabakIncorrect = sabakIncorrect;
        this.sabkiIncorrect = sabkiIncorrect;
        this.manzilIncorrect = manzilIncorrect;
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

    public boolean isSabakStatus() {
        return sabakStatus;
    }

    public void setSabakStatus(boolean sabakStatus) {
        this.sabakStatus = sabakStatus;
    }

    public boolean isSabkiStatus() {
        return sabkiStatus;
    }

    public void setSabkiStatus(boolean sabkiStatus) {
        this.sabkiStatus = sabkiStatus;
    }

    public boolean isManzilStatus() {
        return manzilStatus;
    }

    public void setManzilStatus(boolean manzilStatus) {
        this.manzilStatus = manzilStatus;
    }

    public String getSabakIncorrect() {
        return sabakIncorrect;
    }

    public void setSabakIncorrect(String sabakIncorrect) {
        this.sabakIncorrect = sabakIncorrect;
    }

    public String getSabkiIncorrect() {
        return sabkiIncorrect;
    }

    public void setSabkiIncorrect(String sabkiIncorrect) {
        this.sabkiIncorrect = sabkiIncorrect;
    }

    public String getManzilIncorrect() {
        return manzilIncorrect;
    }

    public void setManzilIncorrect(String manzilIncorrect) {
        this.manzilIncorrect = manzilIncorrect;
    }
}

