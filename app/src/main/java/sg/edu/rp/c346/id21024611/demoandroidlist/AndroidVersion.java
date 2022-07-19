package sg.edu.rp.c346.id21024611.demoandroidlist;

public class AndroidVersion {
    public AndroidVersion(String name, String version) {
        this.name = name;
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    private String name;
    private String version;

    @Override
    public String toString() {
        return name + ": " + version;
    }
}