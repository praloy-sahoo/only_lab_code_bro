/*
A Planet Explorer routinely travels across the planets in the Solar System to discover life form,
minerals available, etc. However, the method of exploring is different on each planet, due to the
difference in atmosphere and surface composition. Every explorer should have an explore method
that is defined based on the type of the explorer and the planet where (s)he is exploring. Consider
three planets-Mars, Venus, and Saturn.
Implement it using interfaces, abstract class, inheritance.
 */



// Interface
interface Explorer {
    void explore(String planet);
    }
     
    // Abstract Class
    abstract class PlanetExplorer implements Explorer {
     
    protected String name;
     
    public PlanetExplorer(String name) {
    this.name = name;
    }
     
    public void display() {
    System.out.println("Explorer Name: " + name);
    }
    }
     
    // Robotic Explorer Class
    class RoboticExplorer extends PlanetExplorer {
     
    public RoboticExplorer(String name) {
    super(name);
    }
     
    @Override
    public void explore(String planet) {
     
    if (planet.equalsIgnoreCase("Mars")) {
    System.out.println("Robot exploring Mars using rovers and drilling machines.");
    }
    else if (planet.equalsIgnoreCase("Venus")) {
    System.out.println("Robot exploring Venus with heat-resistant probes.");
    }
    else if (planet.equalsIgnoreCase("Saturn")) {
    System.out.println("Robot exploring Saturn using orbiters and gas sensors.");
    }
    else {
    System.out.println("Unknown planet.");
    }
    }
    }
     
    // Human Explorer Class
    class HumanExplorer extends PlanetExplorer {
     
    public HumanExplorer(String name) {
    super(name);
    }
     
    @Override
    public void explore(String planet) {
     
    if (planet.equalsIgnoreCase("Mars")) {
    System.out.println("Human collecting soil samples on Mars.");
    }
    else if (planet.equalsIgnoreCase("Venus")) {
    System.out.println("Human cannot explore Venus due to extreme heat.");
    }
    else if (planet.equalsIgnoreCase("Saturn")) {
    System.out.println("Human cannot land on Saturn (gas giant).");
    }
    else {
    System.out.println("Unknown planet.");
    }
    }
    }
     
    // Main Class
    public class Ques9{
     
    public static void main(String[] args) {
     
    PlanetExplorer robot = new RoboticExplorer("RX-1");
    PlanetExplorer human = new HumanExplorer("Neil");
     
    robot.display();
    robot.explore("Mars");
    robot.explore("Venus");
    robot.explore("Saturn");
     
    System.out.println();
     
    human.display();
    human.explore("Mars");
    human.explore("Venus");
    human.explore("Saturn");
    }
    
        }
    
    