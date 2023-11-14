import java.util.Scanner;
import java.util.function.Consumer;

public class Attributes {
  int soldierlytier = Skills.soldierlytier;
  int politicaltier = Skills.politicaltier;
  int industrytier = Skills.industrytier;
  int BRAVERYtier = Skills.BRAVERYtier;
  int INTELLIGENCEtier = Skills.INTELLIGENCEtier;
  int TACTICIANtier = Skills.TACTICIANtier;
  int PERSONABLEtier = Skills.PERSONABLEtier;
  int SOCIALSTATUStier = Skills.SOCIALSTATUStier;
  int FAITHtier = Skills.FAITHtier;
  int STRENGTHtier = Skills.STRENGTHtier;
  int AGILITYtier = Skills.AGILITYtier;
  int LEADERSHIPtier = Skills.LEADERSHIPtier;
  int LUCKtier = Skills.LUCKtier;
  int INFAMYtier = Skills.INFAMYtier;
  String highestAttribute;

  static int Soldierly = 0;

  public static void increaseSoldierly(int amount) {
    System.out.println("SOLDIERLY INCREASED!");
    int soldierlytier = Skills.soldierlytier;
    Soldierly = Soldierly + amount + soldierlytier;
  }

  public void decreaseSoldierly(int amount) {
    System.out.println("SOLDIERLY DECREASED!");
    Soldierly -= amount;
  }

  static int Political = 0;

  public static void increasePolitical(int amount) {
    System.out.println("POLITICAL INCREASED!");
    int politicaltier = Skills.politicaltier;
    Political = Political + amount + politicaltier;
  }

  public void decreasePolitical(int amount) {
    System.out.println("SOLDIERLY DECREASED!");
    Political -= amount;
  }

  static int Industrious = 0;

  public static void increaseIndustrious(int amount) {
    System.out.println("INDUSTRY INCREASED!");
    int industrytier = Skills.industrytier;
    Industrious = Industrious + amount + industrytier;
  }

  public void decreaseIndustrious(int amount) {
    System.out.println("SOLDIERLY DECREASED!");
    Industrious -= amount;
  }

  static int Bravery = 0;

  public static void increaseBravery(int amount) {
    System.out.println("BRAVERY INCREASED!");
    Bravery += amount;
  }

  public void decreaseBravery(int amount) {
    System.out.println("BRAVERY DECREASED!");
    Bravery -= amount;
  }

  static int Intelligence = 0;

  public static void increaseIntelligence(int amount) {
    System.out.println("Intelligence INCREASED!");
    Intelligence += amount;
  }

  public void decreaseIntelligence(int amount) {
    System.out.println("Intelligence DECREASED!");
    Intelligence -= amount;
  }

  static int Tactician = 0;

  public static void increaseTactician(int amount) {
    System.out.println("Tactician INCREASED!");
    Tactician += amount;
  }

  public void decreaseTactician(int amount) {
    System.out.println("Tactician DECREASED!");
    Tactician -= amount;
  }

  static int Personable = 0;

  public static void increasePersonable(int amount) {
    System.out.println("PERSONABLE INCREASED!");
    Personable += amount;
  }

  public void decreasePersonable(int amount) {
    System.out.println("PERSONABLE DECREASED!");
    Personable -= amount;
  }

  static int SocialStatus = 0;

  public static void increaseSocialStatus(int amount) {
    System.out.println("Social Status INCREASED!");
    SocialStatus += amount;
  }

  public void decreaseSocialStatus(int amount) {
    System.out.println("Social Status DECREASED!");
    SocialStatus -= amount;
  }

  static int Religiousness = 0;

  public static void increaseReligiousness(int amount) {
    System.out.println("FAITH INCREASED!");
    Religiousness += amount;
  }

  public void decreaseReligiousness(int amount) {
    System.out.println("FAITH DECREASED!");
    Religiousness -= amount;
  }

  static int Strength = 0;

  public static void increaseStrength(int amount) {
    System.out.println("STRENGTH INCREASED!");
    Strength += amount;
  }

  public void decreaseStrength(int amount) {
    System.out.println("STRENGTH DECREASED!");
    Strength -= amount;
  }

  static int Agility = 0;

  public static void increaseAgility(int amount) {
    System.out.println("AGILITY INCREASED!");
    Agility += amount;
  }

  public void decreaseAgility(int amount) {
    System.out.println("AGILITY DECREASED!");
    Agility -= amount;
  }

  static int Leadership = 0;

  public static void increaseLeadership(int amount) {
    System.out.println("LEADERSHIP INCREASED!");
    Leadership += amount;
  }

  public void decreaseLeadership(int amount) {
    System.out.println("LEADERSHIP DECREASED!");
    Leadership -= amount;
  }

  static int Luck = 0;

  public static void increaseLuck(int amount) {
    System.out.println("LUCK INCREASED!");
    Luck += amount;
  }

  public void decreaseLuck(int amount) {
    System.out.println("LUCK DECREASED!");
    Luck -= amount;
  }

  static int Evil = 0;

  public static void increaseEvil(int amount) {
    Evil += amount;
    System.out.println("INFAMY INCREASED!");
  }

  public void decreaseEvil(int amount) {
    Evil -= amount;
    System.out.println("INFAMY DECREASED!");
  }

  public void displayStats() {

    String starLine = "******************************";
    String emptyLine = "*                            *";

    System.out.println(starLine);
    System.out.println(emptyLine);
    System.out.println("*        Current Stats       *");
    System.out.println(emptyLine);
    System.out.println("*       Soldierly:     " + Soldierly + "     *");
    System.out.println("*       Political:     " + Political + "     *");
    System.out.println("*       Industrious:   " + Industrious + "     *");
    System.out.println("*       Bravery:       " + getBravery() + "     *");
    System.out.println("*       Intelligence:  " + getIntelligence() + "     *");
    System.out.println("*       Tactician:     " + getTactician() + "     *");
    System.out.println("*       Personable:    " + getPersonable() + "     *");
    System.out.println("*       Social Status: " + getSocialStatus() + "     *");
    System.out.println("*       Faith:         " + getReligiousness() + "     *");
    System.out.println("*       Strength:      " + getStrength() + "     *");
    System.out.println("*       Agility:       " + getAgility() + "     *");
    System.out.println("*       Leadership:    " + getLeadership() + "     *");
    System.out.println("*       Luck:          " + getLuck() + "     *");
    System.out.println("*       Infamy:        " + getInfamy() + "     *");
    System.out.println(emptyLine);
    System.out.println(starLine);
  }

  public static void attr(Scanner scanner) throws InterruptedException {
    int totalPoints = 10;
    int[] attributes = new int[14]; // Array to store attribute values
    String[] attributeNames = { "Soldierly", "Political", "Industrious", "Bravery", "Intelligence", "Tactician",
        "Personable", "Social Status", "Faith", "Strength", "Agility", "Leadership", "Luck", "Infamy" };

    System.out.println("What are your starting attributes?");
    System.out.println("You have " + totalPoints + " points to spend.");

    // Declare and initialize the attributeFunctions array
    Consumer<Integer>[] attributeFunctions = new Consumer[14];
    attributeFunctions[0] = value -> increaseSoldierly(value);
    attributeFunctions[1] = value -> increasePolitical(value);
    attributeFunctions[2] = value -> increaseIndustrious(value);
    attributeFunctions[3] = value -> increaseBravery(value);
    attributeFunctions[4] = value -> increaseIntelligence(value);
    attributeFunctions[5] = value -> increaseTactician(value);
    attributeFunctions[6] = value -> increasePersonable(value);
    attributeFunctions[7] = value -> increaseSocialStatus(value);
    attributeFunctions[8] = value -> increaseReligiousness(value);
    attributeFunctions[9] = value -> increaseStrength(value);
    attributeFunctions[10] = value -> increaseAgility(value);
    attributeFunctions[11] = value -> increaseLeadership(value);
    attributeFunctions[12] = value -> increaseLuck(value);
    attributeFunctions[13] = value -> increaseEvil(value);
    // Assign other attribute-increasing functions to the corresponding indices

    for (int i = 0; i < attributeNames.length; i++) {
      System.out.print("Enter points for " + attributeNames[i] + ": ");
      int points = scanner.nextInt();

      // Validate points entered by the user
      while (points < 0 || points > totalPoints) {
        System.out.print("Invalid points! Enter points for " + attributeNames[i] + ": ");
        points = scanner.nextInt();
      }

      attributes[i] = points;
      totalPoints -= points;
    }

    // System.out.println("Final attribute allocation:");
    for (int i = 0; i < attributeNames.length; i++) {
      // System.out.println(attributeNames[i] + ": " + attributes[i]);
      if (attributes[i] > 0) {
        attributeFunctions[i].accept(attributes[i]);
      }
    }
    Thread.sleep(3000);
  }

  public String grabGreatestStat() {

    int highestValue = Integer.MIN_VALUE; // Start with the lowest possible value

    if (Soldierly > highestValue) {
      highestValue = Soldierly;
      highestAttribute = "Soldierly";
    }
    if (Political > highestValue) {
      highestValue = Political;
      highestAttribute = "Political";
    }
    if (Political > highestValue) {
      highestValue = Political;
      highestAttribute = "Industrious";
    }
    return highestAttribute;
  }

  public int getAgility() {
    int Store = 0;
    AGILITYtier = Skills.AGILITYtier;
    if (AGILITYtier == 0) {

      return Agility;
    } else if (AGILITYtier == 1) {

      Store = (int) (Agility * 1.25);
      return Store;
    } else if (AGILITYtier == 2) {

      Store = (int) (Agility * 1.5);
      return Store;
    } else if (AGILITYtier == 3) {

      Store = (int) (Agility * 1.75);
      return Store;
    } else if (AGILITYtier == 4) {

      Store = (int) (Agility * 2);
      return Store;
    }
    Store = 0;
    return 0;
  }

  public int getBravery() {
    int Store = 0;
    AGILITYtier = Skills.BRAVERYtier;
    if (BRAVERYtier == 0) {

      return Bravery;
    } else if (BRAVERYtier == 1) {

      Store = (int) (Bravery * 1.25);
      return Store;
    } else if (BRAVERYtier == 2) {

      Store = (int) (Bravery * 1.5);
      return Store;
    } else if (BRAVERYtier == 3) {

      Store = (int) (Bravery * 1.75);
      return Store;
    } else if (BRAVERYtier == 4) {

      Store = (int) (Bravery * 2);
      return Store;
    }
    Store = 0;
    return 0;
  }

  public int getIntelligence() {
    AGILITYtier = Skills.INTELLIGENCEtier;
    int Store = 0;
    if (INTELLIGENCEtier == 0) {

      return Intelligence;
    } else if (INTELLIGENCEtier == 1) {

      Store = (int) (Intelligence * 1.25);
      return Store;
    } else if (INTELLIGENCEtier == 2) {

      Store = (int) (Intelligence * 1.5);
      return Store;
    } else if (INTELLIGENCEtier == 3) {

      Store = (int) (Intelligence * 1.75);
      return Store;
    } else if (INTELLIGENCEtier == 4) {

      Store = (int) (Intelligence * 2);
      return Store;
    }
    Store = 0;
    return 0;
  }

  public int getTactician() {
    AGILITYtier = Skills.TACTICIANtier;
    int Store = 0;
    if (TACTICIANtier == 0) {

      return Tactician;
    } else if (TACTICIANtier == 1) {

      Store = (int) (Tactician * 1.25);
      return Store;
    } else if (TACTICIANtier == 2) {

      Store = (int) (Tactician * 1.5);
      return Store;
    } else if (TACTICIANtier == 3) {

      Store = (int) (Tactician * 1.75);
      return Store;
    } else if (TACTICIANtier == 4) {

      Store = (int) (Tactician * 2);
      return Store;
    }
    Store = 0;
    return 0;
  }

  public int getPersonable() {
    AGILITYtier = Skills.PERSONABLEtier;
    int Store = 0;
    if (PERSONABLEtier == 0) {

      return Personable;
    } else if (PERSONABLEtier == 1) {

      Store = (int) (Personable * 1.25);
      return Store;
    } else if (PERSONABLEtier == 2) {

      Store = (int) (Personable * 1.5);
      return Store;
    } else if (PERSONABLEtier == 3) {

      Store = (int) (Personable * 1.75);
      return Store;
    } else if (PERSONABLEtier == 4) {

      Store = (int) (Personable * 2);
      return Store;
    }
    Store = 0;
    return 0;
  }

  public int getSocialStatus() {
    AGILITYtier = Skills.SOCIALSTATUStier;
    int Store = 0;
    if (SOCIALSTATUStier == 0) {

      return SocialStatus;
    } else if (SOCIALSTATUStier == 1) {

      Store = (int) (SocialStatus * 1.25);
      return Store;
    } else if (SOCIALSTATUStier == 2) {

      Store = (int) (SocialStatus * 1.5);
      return Store;
    } else if (SOCIALSTATUStier == 3) {

      Store = (int) (SocialStatus * 1.75);
      return Store;
    } else if (SOCIALSTATUStier == 4) {

      Store = (int) (SocialStatus * 2);
      return Store;
    }
    Store = 0;
    return 0;
  }

  public int getReligiousness() {
    AGILITYtier = Skills.FAITHtier;
    int Store = 0;
    if (FAITHtier == 0) {

      return Religiousness;
    } else if (FAITHtier == 1) {

      Store = (int) (Religiousness * 1.25);
      return Store;
    } else if (FAITHtier == 2) {

      Store = (int) (Religiousness * 1.5);
      return Store;
    } else if (FAITHtier == 3) {

      Store = (int) (Religiousness * 1.75);
      return Store;
    } else if (FAITHtier == 4) {

      Store = (int) (Religiousness * 2);
      return Store;
    }
    Store = 0;
    return 0;
  }

  public int getStrength() {
    AGILITYtier = Skills.STRENGTHtier;
    int Store = 0;
    if (STRENGTHtier == 0) {

      return Strength;
    } else if (STRENGTHtier == 1) {

      Store = (int) (Strength * 1.25);
      return Store;
    } else if (STRENGTHtier == 2) {

      Store = (int) (Strength * 1.5);
      return Store;
    } else if (STRENGTHtier == 3) {

      Store = (int) (Strength * 1.75);
      return Store;
    } else if (STRENGTHtier == 4) {

      Store = (int) (Strength * 2);
      return Store;
    }
    Store = 0;
    return 0;
  }

  public int getLeadership() {
    AGILITYtier = Skills.LEADERSHIPtier;
    int Store = 0;
    if (LEADERSHIPtier == 0) {

      return Leadership;
    } else if (LEADERSHIPtier == 1) {

      Store = (int) (Leadership * 1.25);
      return Store;
    } else if (LEADERSHIPtier == 2) {

      Store = (int) (Leadership * 1.5);
      return Store;
    } else if (LEADERSHIPtier == 3) {

      Store = (int) (Leadership * 1.75);
      return Store;
    } else if (LEADERSHIPtier == 4) {

      Store = (int) (Leadership * 2);
      return Store;
    }
    Store = 0;
    return 0;
  }

  public int getLuck() {
    AGILITYtier = Skills.LUCKtier;
    int Store = 0;
    if (LUCKtier == 0) {

      return Luck;
    } else if (LUCKtier == 1) {

      Store = (int) (Luck * 1.25);
      return Store;
    } else if (LUCKtier == 2) {

      Store = (int) (Luck * 1.5);
      return Store;
    } else if (LUCKtier == 3) {

      Store = (int) (Luck * 1.75);
      return Store;
    } else if (LUCKtier == 4) {

      Store = (int) (Luck * 2);
      return Store;
    }
    Store = 0;
    return 0;
  }

  public int getInfamy() {
    AGILITYtier = Skills.INFAMYtier;
    int Store = 0;
    if (INFAMYtier == 0) {

      return Evil;
    } else if (INFAMYtier == 1) {

      Store = (int) (Evil * 1.25);
      return Store;
    } else if (INFAMYtier == 2) {

      Store = (int) (Evil * 1.5);
      return Store;
    } else if (INFAMYtier == 3) {

      Store = (int) (Evil * 1.75);
      return Store;
    } else if (INFAMYtier == 4) {

      Store = (int) (Evil * 2);
      return Store;
    }
    Store = 0;
    return 0;
  }

}
/*
 * int soldierlytier = Skills.soldierlytier;
 * int politicaltier = Skills.politicaltier;
 * int industrytier = Skills.industrytier;
 * int BRAVERYtier = Skills.BRAVERYtier;
 * int INTELLIGENCEtier = Skills.INTELLIGENCEtier;
 * int TACTICIANtier = Skills.TACTICIANtier;
 * int PERSONABLEtier = Skills.PERSONABLEtier;
 * int SOCIALSTATUStier = Skills.SOCIALSTATUStier;
 * int FAITHtier = Skills.FAITHtier;
 * int STRENGTHtier = Skills.STRENGTHtier;
 * int AGILITYtier = Skills.AGILITYtier;
 * int LEADERSHIPtier = Skills.LEADERSHIPtier;
 * int LUCKtier = Skills.LUCKtier;
 * int INFAMYtier = Skills.INFAMYtier;
 */