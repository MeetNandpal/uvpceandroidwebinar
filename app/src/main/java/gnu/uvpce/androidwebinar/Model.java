package gnu.uvpce.androidwebinar;

public class Model {

    private String name;
    private String version;
    private int image;

    public Model(String name, String version, int image) {
        this.name = name;
        this.version = version;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getVersion() {
        return version;
    }

    public int getImage() {
        return image;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
