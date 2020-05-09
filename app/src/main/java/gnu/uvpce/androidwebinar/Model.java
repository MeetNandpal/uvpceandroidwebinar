package gnu.uvpce.androidwebinar;

public class Model {

    private String name;
    private String version;
    private String image;

    public Model() {
    }

    public Model(String name, String version, String image) {
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

    public String getImage() {
        return image;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
