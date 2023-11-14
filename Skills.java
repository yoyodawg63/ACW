import java.util.Scanner;

public class Skills {

  static int exp = 0;
  static int soldierlytier = 0;
  static int politicaltier = 0;
  static int industrytier = 0;
  static int BRAVERYtier = 0;
  static int INTELLIGENCEtier = 0;
  static int TACTICIANtier = 0;
  static int PERSONABLEtier = 0;
  static int SOCIALSTATUStier = 0;
  static int FAITHtier = 0;
  static int STRENGTHtier = 0;
  static int AGILITYtier = 0;
  static int LEADERSHIPtier = 0;
  static int LUCKtier = 0;
  static int INFAMYtier = 0;

  static int soldierlyStat = Attributes.Soldierly;
  static int politicalStat = Attributes.Political;
  static int industryStat = Attributes.Industrious;

  public static void expIncrease(int num) {
    exp = exp + num;
    if (exp > 99) {
      System.out.println("You have enough experience to upgrade a skill! Do you want to open your skills almanac?");
      System.out.println("A: YES\nB: NO");

      Scanner scannerupgradeSkill = new Scanner(System.in);
      String upgradeSkill = scannerupgradeSkill.nextLine();

      if (upgradeSkill.equals("A")) {
        exp = skillsCatolog(exp);
      }

    }
  }

  public static int skillsCatolog(int exp) {
    String skillChoice;
    String title = "SKILLS ALMANAC";
    String boxLine = "*".repeat(120); // Generate a line of 60 stars

    // Center the title within the box
    int padding = (120 - title.length()) / 2;
    String centeredTitle = String.format("%" + padding + "s%s%" + padding + "s", "", title, "");

    // Print the box of stars with the centered title
    System.out.println(boxLine);
    System.out.println(centeredTitle);
    System.out.println(boxLine);

    // Print the SOLDIERLY SKILLS section
    System.out.println("SOLDIERLY SKILLS");
    System.out.println(
        "A1: tier 1: costs 200 exp - +1 soldierly to every instance that gives soldierly (pre-requisite: 15 soldierly)");
    System.out.println(
        "A2: tier 2: costs 300 exp - +2 soldierly to every instance that gives soldierly (pre-requisite: 30 soldierly and tier one soldierly skill unlocked)");
    System.out.println(
        "A3: tier 3: costs 400 exp - +3 soldierly to every instance that gives soldierly (pre-requisite: 60 soldierly and tier one and two soldierly skills unlocked)\n");
    System.out.println(boxLine);
    // Print the POLITICAL SKILLS section
    System.out.println("POLITICAL SKILLS");
    System.out.println(
        "B1: tier 1: costs 200 exp - +1 political to every instance that gives political (pre-requisite: 15 political)");
    System.out.println(
        "B2: tier 2: costs 300 exp - +2 political to every instance that gives political (pre-requisite: 30 political and tier one political unlocked)");
    System.out.println(
        "B3: tier 3: costs 400 exp - +3 political to every instance that gives political (pre-requisite: 60 political and tier one and two political unlocked)\n");
    System.out.println(boxLine);
    // Print the INDUSTRIAL SKILLS section
    System.out.println("INDUSTRIAL SKILLS");
    System.out.println(
        "C1: tier 1: costs 200 exp - +1 industrious to every instance that gives industrious (pre-requisite: 15 industrious)");
    System.out.println(
        "C2: tier 2: costs 300 exp - +2 industrious to every instance that gives industrious (pre-requisite: 30 industrious and tier one industrious unlocked)");
    System.out.println(
        "C3: tier 3: costs 400 exp - +3 industrious to every instance that gives industrious (pre-requisite: 60 industrious and tier one and two industrious unlocked)\n");
    System.out.println(boxLine);
    System.out.println("BRAVERY SKILLS");
    System.out.println("D1: tier 1: costs 100 exp: gives 25% boost in BRAVERY STAT\r\n" + //
        "D2: tier 2: costs 100 exp: gives 50% boost in BRAVERY STAT (REQUIRES TIER 1)\r\n" + //
        "D3: tier 3: costs 100 exp: gives 75% boost in BRAVERY STAT (REQUIRES TIER 2)\r\n" + //
        "D4: tier 4: costs 100 exp: gives 100% boost in BRAVERY STAT (REQUIRES TIER 3)");
    System.out.println(boxLine);
    System.out.println("INTELLIGENCE SKILLS");
    System.out.println("E1: tier 1: costs 100 exp: gives 25% boost in INTELLIGENCE STAT\r\n" + //
        "E2: tier 2: costs 100 exp: gives 50% boost in INTELLIGENCE STAT (REQUIRES TIER 1)\r\n" + //
        "E3: tier 3: costs 100 exp: gives 75% boost in INTELLIGENCE STAT (REQUIRES TIER 2)\r\n" + //
        "E4: tier 4: costs 100 exp: gives 100% boost in INTELLIGENCE STAT (REQUIRES TIER 3)");
    System.out.println(boxLine);
    System.out.println("TACTICIAN SKILLS");
    System.out.println("F1: tier 1: costs 100 exp: gives 25% boost in TACTICIAN STAT\r\n" + //
        "F2: tier 2: costs 100 exp: gives 50% boost in TACTICIAN STAT (REQUIRES TIER 1)\r\n" + //
        "F3: tier 3: costs 100 exp: gives 75% boost in TACTICIAN STAT (REQUIRES TIER 2)\r\n" + //
        "F4: tier 4: costs 100 exp: gives 100% boost in TACTICIAN STAT (REQUIRES TIER 3)");
    System.out.println(boxLine);
    System.out.println("PERSONABLE SKILLS");
    System.out.println("G1: tier 1: costs 100 exp: gives 25% boost in PERSONABLE STAT\r\n" + //
        "G2: tier 2: costs 100 exp: gives 50% boost in PERSONABLE STAT (REQUIRES TIER 1)\r\n" + //
        "G3: tier 3: costs 100 exp: gives 75% boost in PERSONABLE STAT (REQUIRES TIER 2)\r\n" + //
        "G4: tier 4: costs 100 exp: gives 100% boost in PERSONABLE STAT (REQUIRES TIER 3)");
    System.out.println(boxLine);
    System.out.println("SOCIAL STATUS SKILLS");
    System.out.println("H1: tier 1: costs 100 exp: gives 25% boost in SOCIAL STATUS STAT\r\n" + //
        "H2: tier 2: costs 100 exp: gives 50% boost in SOCIAL STATUS STAT (REQUIRES TIER 1)\r\n" + //
        "H3: tier 3: costs 100 exp: gives 75% boost in SOCIAL STATUS STAT (REQUIRES TIER 2)\r\n" + //
        "H4: tier 4: costs 100 exp: gives 100% boost in SOCIAL STATUS STAT (REQUIRES TIER 3)");
    System.out.println(boxLine);
    System.out.println("FAITH SKILLS");
    System.out.println("I1: tier 1: costs 100 exp: gives 25% boost in FAITH STAT\r\n" + //
        "I2: tier 2: costs 100 exp: gives 50% boost in FAITH STAT (REQUIRES TIER 1)\r\n" + //
        "I3: tier 3: costs 100 exp: gives 75% boost in FAITH STAT (REQUIRES TIER 2)\r\n" + //
        "I4: tier 4: costs 100 exp: gives 100% boost in FAITH STAT (REQUIRES TIER 3)");
    System.out.println(boxLine);
    System.out.println("STRENGTH SKILLS");
    System.out.println("J1: tier 1: costs 100 exp: gives 25% boost in STRENGTH STAT\r\n" + //
        "J2: tier 2: costs 100 exp: gives 50% boost in STRENGTH STAT (REQUIRES TIER 1)\r\n" + //
        "J3: tier 3: costs 100 exp: gives 75% boost in STRENGTH STAT (REQUIRES TIER 2)\r\n" + //
        "J4: tier 4: costs 100 exp: gives 100% boost in STRENGTH STAT (REQUIRES TIER 3)");
    System.out.println(boxLine);
    System.out.println("AGILITY SKILLS");
    System.out.println("K1: tier 1: costs 100 exp: gives 25% boost in AGILITY STAT\r\n" + //
        "K2: tier 2: costs 100 exp: gives 50% boost in AGILITY STAT (REQUIRES TIER 1)\r\n" + //
        "K3: tier 3: costs 100 exp: gives 75% boost in AGILITY STAT (REQUIRES TIER 2)\r\n" + //
        "K4: tier 4: costs 100 exp: gives 100% boost in AGILITY STAT (REQUIRES TIER 3)");
    System.out.println(boxLine);
    System.out.println("LEADERSHIP SKILLS");
    System.out.println("L1: tier 1: costs 100 exp: gives 25% boost in LEADERSHIP STAT\r\n" + //
        "L2: tier 2: costs 100 exp: gives 50% boost in LEADERSHIP STAT (REQUIRES TIER 1)\r\n" + //
        "L3: tier 3: costs 100 exp: gives 75% boost in LEADERSHIP STAT (REQUIRES TIER 2)\r\n" + //
        "L4: tier 4: costs 100 exp: gives 100% boost in LEADERSHIP STAT (REQUIRES TIER 3)");
    System.out.println(boxLine);
    System.out.println("LUCK SKILLS");
    System.out.println("M1: tier 1: costs 100 exp: gives 25% boost in LUCK STAT\r\n" + //
        "M2: tier 2: costs 100 exp: gives 50% boost in LUCK STAT (REQUIRES TIER 1)\r\n" + //
        "M3: tier 3: costs 100 exp: gives 75% boost in LUCK STAT (REQUIRES TIER 2)\r\n" + //
        "M4: tier 4: costs 100 exp: gives 100% boost in LUCK STAT (REQUIRES TIER 3)");
    System.out.println(boxLine);
    System.out.println("INFAMY SKILLS");
    System.out.println("N1: tier 1: costs 100 exp: gives 25% boost in INFAMY STAT\r\n" + //
        "N2: tier 2: costs 100 exp: gives 50% boost in INFAMY STAT (REQUIRES TIER 1)\r\n" + //
        "N3: tier 3: costs 100 exp: gives 75% boost in INFAMY STAT (REQUIRES TIER 2)\r\n" + //
        "N4: tier 4: costs 100 exp: gives 100% boost in INFAMY STAT (REQUIRES TIER 3)");
    System.out.println(boxLine);

    do {
      System.out.println("Current exp: " + exp);
      System.out.println("What skill do you want to upgrade? Input ? to exit.");
      int soldierlyStat = Attributes.Soldierly;
      Scanner scannerskillChoice = new Scanner(System.in);
      skillChoice = scannerskillChoice.nextLine();

      switch (skillChoice) {

        case "A1":

          if (exp > 199 && soldierlytier == 0 && soldierlyStat > 14) {

            System.out.println("Upgrading to tier 1 in the soldierly skill!");
            exp = exp - 200;
            soldierlytier = 1;
          } else {
            System.out.println("Invalid exp amount, current tier level, or stat pre-requisite.");

          }
          break;

        case "A2":

          if (exp > 299 && soldierlytier == 1 && soldierlyStat > 29) {

            System.out.println("Upgrading to tier 2 in the soldierly skill!");
            exp = exp - 300;
            soldierlytier = 2;
          } else {
            System.out.println("Invalid exp amount, current tier level, or stat pre-requisite.");
          }
          break;

        case "A3":

          if (exp > 399 && soldierlytier == 2 && soldierlyStat > 59) {

            System.out.println("Upgrading to tier 3 in the soldierly skill!");
            exp = exp - 400;
            soldierlytier = 3;
          } else {
            System.out.println("Invalid exp amount, current tier level, or stat pre-requisite.");
          }
          break;

        case "B1":

          if (exp > 199 && politicaltier == 0 && politicalStat > 14) {

            System.out.println("Upgrading to tier 1 in the political skill!");
            exp = exp - 200;
            politicaltier = 1;
          } else {
            System.out.println("Invalid exp amount, current tier level, or stat pre-requisite.");
          }
          break;

        case "B2":

          if (exp > 299 && politicaltier == 1 && politicalStat > 29) {

            System.out.println("Upgrading to tier 2 in the political skill!");
            exp = exp - 300;
            politicaltier = 2;
          } else {
            System.out.println("Invalid exp amount, current tier level, or stat pre-requisite.");
          }
          break;

        case "B3":

          if (exp > 399 && politicaltier == 2 && politicalStat > 59) {

            System.out.println("Upgrading to tier 3 in the political skill!");
            exp = exp - 400;
            politicaltier = 3;
          } else {
            System.out.println("Invalid exp amount, current tier level, or stat pre-requisite.");
          }
          break;

        case "C1":

          if (exp > 199 && industrytier == 0 && industryStat > 14) {

            System.out.println("Upgrading to tier 1 in the industry skill!");
            exp = exp - 200;
            politicaltier = 1;
          } else {
            System.out.println("Invalid exp amount, current tier level, or stat pre-requisite.");
          }
          break;

        case "C2":

          if (exp > 299 && industrytier == 1 && industryStat > 29) {

            System.out.println("Upgrading to tier 2 in the industry skill!");
            exp = exp - 300;
            politicaltier = 2;
          } else {
            System.out.println("Invalid exp amount, current tier level, or stat pre-requisite.");
          }
          break;

        case "C3":

          if (exp > 399 && industrytier == 2 && industryStat > 59) {

            System.out.println("Upgrading to tier 3 in the industry skill!");
            exp = exp - 400;
            politicaltier = 3;
          } else {
            System.out.println("Invalid exp amount, current tier level, or stat pre-requisite");
          }
          break;

        case "D1":

          if (exp > 99 && BRAVERYtier == 0) {

            System.out.println("Upgrading to tier 1 in the BRAVERY skill!");
            exp = exp - 100;
            BRAVERYtier = 1;
          } else {
            System.out.println("Invalid exp amount, current tier level, or stat pre-requisite");
          }
          break;

        case "D2":

          if (exp > 99 && BRAVERYtier == 1) {

            System.out.println("Upgrading to tier 2 in the BRAVERY skill!");
            exp = exp - 100;
            BRAVERYtier = 2;
          } else {
            System.out.println("Invalid exp amount, current tier level, or stat pre-requisite");
          }
          break;

        case "D3":

          if (exp > 99 && BRAVERYtier == 2) {

            System.out.println("Upgrading to tier 3 in the BRAVERY skill!");
            exp = exp - 100;
            BRAVERYtier = 3;
          } else {
            System.out.println("Invalid exp amount, current tier level, or stat pre-requisite");
          }
          break;

        case "D4":

          if (exp > 99 && BRAVERYtier == 3) {

            System.out.println("Upgrading to tier 4 in the BRAVERY skill!");
            exp = exp - 100;
            BRAVERYtier = 4;
          } else {
            System.out.println("Invalid exp amount, current tier level, or stat pre-requisite");
          }
          break;

        case "E1":

          if (exp > 99 && INTELLIGENCEtier == 0) {

            System.out.println("Upgrading to tier 1 in the INTELLIGENCE skill!");
            exp = exp - 100;
            INTELLIGENCEtier = 1;
          } else {
            System.out.println("Invalid exp amount, current tier level, or stat pre-requisite");
          }
          break;

        case "E2":

          if (exp > 99 && INTELLIGENCEtier == 1) {

            System.out.println("Upgrading to tier 2 in the INTELLIGENCE skill!");
            exp = exp - 100;
            INTELLIGENCEtier = 2;
          } else {
            System.out.println("Invalid exp amount, current tier level, or stat pre-requisite");
          }
          break;

        case "E3":

          if (exp > 99 && INTELLIGENCEtier == 2) {

            System.out.println("Upgrading to tier 3 in the INTELLIGENCE skill!");
            exp = exp - 100;
            INTELLIGENCEtier = 3;
          } else {
            System.out.println("Invalid exp amount, current tier level, or stat pre-requisite");
          }
          break;

        case "E4":

          if (exp > 99 && INTELLIGENCEtier == 3) {

            System.out.println("Upgrading to tier 4 in the INTELLIGENCE skill!");
            exp = exp - 100;
            INTELLIGENCEtier = 4;
          } else {
            System.out.println("Invalid exp amount, current tier level, or stat pre-requisite");
          }
          break;

        case "F1":

          if (exp > 99 && TACTICIANtier == 0) {

            System.out.println("Upgrading to tier 1 in the TACTICIAN skill!");
            exp = exp - 100;
            TACTICIANtier = 1;
          } else {
            System.out.println("Invalid exp amount, current tier level, or stat pre-requisite");
          }
          break;

        case "F2":

          if (exp > 99 && TACTICIANtier == 1) {

            System.out.println("Upgrading to tier 2 in the TACTICIAN skill!");
            exp = exp - 100;
            TACTICIANtier = 2;
          } else {
            System.out.println("Invalid exp amount, current tier level, or stat pre-requisite");
          }
          break;

        case "F3":

          if (exp > 99 && TACTICIANtier == 2) {

            System.out.println("Upgrading to tier 3 in the TACTICIAN skill!");
            exp = exp - 100;
            TACTICIANtier = 3;
          } else {
            System.out.println("Invalid exp amount, current tier level, or stat pre-requisite");
          }
          break;

        case "F4":

          if (exp > 99 && TACTICIANtier == 3) {

            System.out.println("Upgrading to tier 4 in the TACTICIAN skill!");
            exp = exp - 100;
            TACTICIANtier = 4;
          } else {
            System.out.println("Invalid exp amount, current tier level, or stat pre-requisite");
          }
          break;

        case "G1":

          if (exp > 99 && PERSONABLEtier == 0) {

            System.out.println("Upgrading to tier 1 in the PERSONABLE skill!");
            exp = exp - 100;
            PERSONABLEtier = 1;
          } else {
            System.out.println("Invalid exp amount, current tier level, or stat pre-requisite");
          }
          break;

        case "G2":

          if (exp > 99 && PERSONABLEtier == 1) {

            System.out.println("Upgrading to tier 2 in the PERSONABLE skill!");
            exp = exp - 100;
            PERSONABLEtier = 2;
          } else {
            System.out.println("Invalid exp amount, current tier level, or stat pre-requisite");
          }
          break;

        case "G3":

          if (exp > 99 && PERSONABLEtier == 2) {

            System.out.println("Upgrading to tier 3 in the PERSONABLE skill!");
            exp = exp - 100;
            PERSONABLEtier = 3;
          } else {
            System.out.println("Invalid exp amount, current tier level, or stat pre-requisite");
          }
          break;

        case "G4":

          if (exp > 99 && PERSONABLEtier == 3) {

            System.out.println("Upgrading to tier 4 in the PERSONABLE skill!");
            exp = exp - 100;
            PERSONABLEtier = 4;
          } else {
            System.out.println("Invalid exp amount, current tier level, or stat pre-requisite");
          }
          break;

        case "H1":

          if (exp > 99 && SOCIALSTATUStier == 0) {

            System.out.println("Upgrading to tier 1 in the SOCIALSTATUS skill!");
            exp = exp - 100;
            SOCIALSTATUStier = 1;
          } else {
            System.out.println("Invalid exp amount, current tier level, or stat pre-requisite");
          }
          break;

        case "H2":

          if (exp > 99 && SOCIALSTATUStier == 1) {

            System.out.println("Upgrading to tier 2 in the SOCIALSTATUS skill!");
            exp = exp - 100;
            SOCIALSTATUStier = 2;
          } else {
            System.out.println("Invalid exp amount, current tier level, or stat pre-requisite");
          }
          break;

        case "H3":

          if (exp > 99 && SOCIALSTATUStier == 2) {

            System.out.println("Upgrading to tier 3 in the SOCIALSTATUS skill!");
            exp = exp - 100;
            SOCIALSTATUStier = 3;
          } else {
            System.out.println("Invalid exp amount, current tier level, or stat pre-requisite");
          }
          break;

        case "H4":

          if (exp > 99 && SOCIALSTATUStier == 3) {

            System.out.println("Upgrading to tier 4 in the SOCIALSTATUS skill!");
            exp = exp - 100;
            SOCIALSTATUStier = 4;
          } else {
            System.out.println("Invalid exp amount, current tier level, or stat pre-requisite");
          }
          break;

        case "I1":

          if (exp > 99 && FAITHtier == 0) {

            System.out.println("Upgrading to tier 1 in the FAITH skill!");
            exp = exp - 100;
            FAITHtier = 1;
          } else {
            System.out.println("Invalid exp amount, current tier level, or stat pre-requisite");
          }
          break;

        case "I2":

          if (exp > 99 && FAITHtier == 1) {

            System.out.println("Upgrading to tier 2 in the FAITH skill!");
            exp = exp - 100;
            FAITHtier = 2;
          } else {
            System.out.println("Invalid exp amount, current tier level, or stat pre-requisite");
          }
          break;

        case "I3":

          if (exp > 99 && FAITHtier == 2) {

            System.out.println("Upgrading to tier 3 in the FAITH skill!");
            exp = exp - 100;
            FAITHtier = 3;
          } else {
            System.out.println("Invalid exp amount, current tier level, or stat pre-requisite");
          }
          break;

        case "I4":

          if (exp > 99 && FAITHtier == 3) {

            System.out.println("Upgrading to tier 4 in the FAITH skill!");
            exp = exp - 100;
            FAITHtier = 4;
          } else {
            System.out.println("Invalid exp amount, current tier level, or stat pre-requisite");
          }
          break;

        case "J1":

          if (exp > 99 && STRENGTHtier == 0) {

            System.out.println("Upgrading to tier 1 in the STRENGTH skill!");
            exp = exp - 100;
            STRENGTHtier = 1;
          } else {
            System.out.println("Invalid exp amount, current tier level, or stat pre-requisite");
          }
          break;

        case "J2":

          if (exp > 99 && STRENGTHtier == 1) {

            System.out.println("Upgrading to tier 2 in the STRENGTH skill!");
            exp = exp - 100;
            STRENGTHtier = 2;
          } else {
            System.out.println("Invalid exp amount, current tier level, or stat pre-requisite");
          }
          break;

        case "J3":

          if (exp > 99 && STRENGTHtier == 2) {

            System.out.println("Upgrading to tier 3 in the STRENGTH skill!");
            exp = exp - 100;
            STRENGTHtier = 3;
          } else {
            System.out.println("Invalid exp amount, current tier level, or stat pre-requisite");
          }
          break;

        case "J4":

          if (exp > 99 && STRENGTHtier == 3) {

            System.out.println("Upgrading to tier 4 in the STRENGTH skill!");
            exp = exp - 100;
            STRENGTHtier = 4;
          } else {
            System.out.println("Invalid exp amount, current tier level, or stat pre-requisite");
          }
          break;

        case "K1":

          if (exp > 99 && AGILITYtier == 0) {

            System.out.println("Upgrading to tier 1 in the AGILITY skill!");
            exp = exp - 100;
            AGILITYtier = 1;
          } else {
            System.out.println("Invalid exp amount, current tier level, or stat pre-requisite");
          }
          break;

        case "K2":

          if (exp > 99 && AGILITYtier == 1) {

            System.out.println("Upgrading to tier 2 in the AGILITY skill!");
            exp = exp - 100;
            AGILITYtier = 2;
          } else {
            System.out.println("Invalid exp amount, current tier level, or stat pre-requisite");
          }
          break;

        case "K3":

          if (exp > 99 && AGILITYtier == 2) {

            System.out.println("Upgrading to tier 3 in the AGILITY skill!");
            exp = exp - 100;
            AGILITYtier = 3;
          } else {
            System.out.println("Invalid exp amount, current tier level, or stat pre-requisite");
          }
          break;

        case "K4":

          if (exp > 99 && AGILITYtier == 3) {

            System.out.println("Upgrading to tier 4 in the AGILITY skill!");
            exp = exp - 100;
            AGILITYtier = 4;
          } else {
            System.out.println("Invalid exp amount, current tier level, or stat pre-requisite");
          }
          break;

        case "L1":

          if (exp > 99 && LEADERSHIPtier == 0) {

            System.out.println("Upgrading to tier 1 in the LEADERSHIP skill!");
            exp = exp - 100;
            LEADERSHIPtier = 1;
          } else {
            System.out.println("Invalid exp amount, current tier level, or stat pre-requisite");
          }
          break;

        case "L2":

          if (exp > 99 && LEADERSHIPtier == 1) {

            System.out.println("Upgrading to tier 2 in the LEADERSHIP skill!");
            exp = exp - 100;
            LEADERSHIPtier = 2;
          } else {
            System.out.println("Invalid exp amount, current tier level, or stat pre-requisite");
          }
          break;

        case "L3":

          if (exp > 99 && LEADERSHIPtier == 2) {

            System.out.println("Upgrading to tier 3 in the LEADERSHIP skill!");
            exp = exp - 100;
            LEADERSHIPtier = 3;
          } else {
            System.out.println("Invalid exp amount, current tier level, or stat pre-requisite");
          }
          break;

        case "L4":

          if (exp > 99 && LEADERSHIPtier == 3) {

            System.out.println("Upgrading to tier 4 in the LEADERSHIP skill!");
            exp = exp - 100;
            LEADERSHIPtier = 4;
          } else {
            System.out.println("Invalid exp amount, current tier level, or stat pre-requisite");
          }
          break;

        case "M1":

          if (exp > 99 && LUCKtier == 0) {

            System.out.println("Upgrading to tier 1 in the LUCK skill!");
            exp = exp - 100;
            LUCKtier = 1;
          } else {
            System.out.println("Invalid exp amount, current tier level, or stat pre-requisite");
          }
          break;

        case "M2":

          if (exp > 99 && LUCKtier == 1) {

            System.out.println("Upgrading to tier 2 in the LUCK skill!");
            exp = exp - 100;
            LUCKtier = 2;
          } else {
            System.out.println("Invalid exp amount, current tier level, or stat pre-requisite");
          }
          break;

        case "M3":

          if (exp > 99 && LUCKtier == 2) {

            System.out.println("Upgrading to tier 3 in the LUCK skill!");
            exp = exp - 100;
            LUCKtier = 3;
          } else {
            System.out.println("Invalid exp amount, current tier level, or stat pre-requisite");
          }
          break;

        case "M4":

          if (exp > 99 && LUCKtier == 3) {

            System.out.println("Upgrading to tier 4 in the LUCK skill!");
            exp = exp - 100;
            LUCKtier = 4;
          } else {
            System.out.println("Invalid exp amount, current tier level, or stat pre-requisite");
          }
          break;

        case "N1":

          if (exp > 99 && INFAMYtier == 0) {

            System.out.println("Upgrading to tier 1 in the INFAMY skill!");
            exp = exp - 100;
            INFAMYtier = 1;
          } else {
            System.out.println("Invalid exp amount, current tier level, or stat pre-requisite");
          }
          break;

        case "N2":

          if (exp > 99 && INFAMYtier == 1) {

            System.out.println("Upgrading to tier 2 in the INFAMY skill!");
            exp = exp - 100;
            INFAMYtier = 2;
          } else {
            System.out.println("Invalid exp amount, current tier level, or stat pre-requisite");
          }
          break;

        case "N3":

          if (exp > 99 && INFAMYtier == 2) {

            System.out.println("Upgrading to tier 3 in the INFAMY skill!");
            exp = exp - 100;
            INFAMYtier = 3;
          } else {
            System.out.println("Invalid exp amount, current tier level, or stat pre-requisite");
          }
          break;

        case "N4":

          if (exp > 99 && INFAMYtier == 3) {

            System.out.println("Upgrading to tier 4 in the INFAMY skill!");
            exp = exp - 100;
            INFAMYtier = 4;
          } else {
            System.out.println("Invalid exp amount, current tier level, or stat pre-requisite");
          }
          break;
      }

    } while (!skillChoice.equals("?"));

    System.out.println("Closing Skills Catolog...");
    return exp;
  }

}
