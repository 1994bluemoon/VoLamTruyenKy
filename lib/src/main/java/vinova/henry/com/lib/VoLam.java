package vinova.henry.com.lib;

public class VoLam extends MonPhai{
    private String Name;

    public VoLam(String tenMonPhai, String name, int capDo) {
        super(tenMonPhai, capDo);
        this.Name = name;
    }

    public String getName() {
        return Name;
    }
}
