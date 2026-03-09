// Interface: rule that every explorer must explore
interface Explorer {
    void explore();
}

// Abstract class: common features of all explorers
abstract class PlanetExplorer implements Explorer {

    String name;

    PlanetExplorer(String name) {
        this.name = name;
    }

    // common method
    void startMission() {
        System.out.println(name + " starting exploration mission");
    }
}

// Mars Explorer
class MarsExplorer extends PlanetExplorer {

    MarsExplorer(String name) {
        super(name);
    }

    @Override
    public void explore() {
        System.out.println("Exploring Mars using rover and soil analysis");
    }
}

// Venus Explorer
class VenusExplorer extends PlanetExplorer {

    VenusExplorer(String name) {
        super(name);
    }

    @Override
    public void explore() {
        System.out.println("Exploring Venus using heat-resistant probes");
    }
}

// Saturn Explorer
class SaturnExplorer extends PlanetExplorer {

    SaturnExplorer(String name) {
        super(name);
    }

    @Override
    public void explore() {
        System.out.println("Exploring Saturn by analyzing gases and rings");
    }
}

// Main class to test
public class PlanetMissionTest {

    public static void main(String[] args) {

        PlanetExplorer mars = new MarsExplorer("Explorer-Mars");
        PlanetExplorer venus = new VenusExplorer("Explorer-Venus");
        PlanetExplorer saturn = new SaturnExplorer("Explorer-Saturn");

        mars.startMission();
        mars.explore();

        venus.startMission();
        venus.explore();

        saturn.startMission();
        saturn.explore();
    }
}
