import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Stonewall {
  Clip clip2;
  private Attributes attributes;
  private Chances chances;

  public Stonewall(Attributes attributes) {
    this.attributes = attributes;
  }

  public Stonewall(Chances chances) {
    this.chances = chances;
  }

  static String name = main.getName();
  static char grandmaCatchesYou;
  static int enteringgrandmahousecounter = 0;
  static int goingupstairscounter = 0;
  static boolean bookshelf = true;
  static String keepToy;
  static int sleepcounter = 0;
  static char check;
  static char sisterLive;

  public void StonewallPlay()
      throws InterruptedException, UnsupportedAudioFileException, IOException, LineUnavailableException {

    attributes.displayStats();
    Scanner scanner = new Scanner(System.in);
    Attributes.attr(scanner);

    attributes.displayStats();
    System.out.println(
        "You are born in 1824 in Clarksburg, Virginia, which is now (in the present day) part of West Virginia.");
    Thread.sleep(3000);
    System.out
        .println(
            "You are born to two loving parents and have an older sister and brother, named Elizabeth and Warren, respectively.");
    System.out.println(
        "Your father, Jonathan, is lawyer and your mother, Julia, is a home maker. Your family is not rich, but you are locally prominent within Clarksburg.");

    Thread.sleep(3000);
    System.out.println("At the age of 1, your parents decided to get you a couple of toys for your birthday.\n" +
        "They got you a toy train, a toy soldier, and a tiny top-hat.\n" +
        "Which of the toys/objects do you want to play with first?\n" +
        "Input A for the train, B for the soldier, and C for the top-hat.");

    Scanner scannertoyChoice = new Scanner(System.in);
    String toyChoice = scannertoyChoice.nextLine();

    if (toyChoice.equals("A")) {
      System.out.println(
          "You grabbed for the train and took delight in rolling it around, as you cutely said: choo-choo.");

      try {
        File file2 = new File("Audio\\Wooden-Train-Whistle.wav");
        AudioInputStream audioStream2 = AudioSystem.getAudioInputStream(file2);
        Clip clip2 = AudioSystem.getClip();
        clip2.open(audioStream2);
        clip2.start();
      } catch (IOException | UnsupportedAudioFileException | LineUnavailableException e) {
        e.printStackTrace();
      }

      Attributes.increaseIndustrious(1);
      // System.out.println("Your current Industrious stat: " +
      // attributes.Industrious);
      attributes.displayStats();

    }

    else if (toyChoice.equals("B")) {
      System.out.println(
          "You grabbed for the soldier and took delight in marching it around, as you cutely said: hoorah!");

      try {
        File file2 = new File("Audio\\Rifle-Musket-Fire-Volley.wav");
        AudioInputStream audioStream2 = AudioSystem.getAudioInputStream(file2);
        Clip clip2 = AudioSystem.getClip();
        clip2.open(audioStream2);

        FloatControl gainControl = (FloatControl) clip2.getControl(FloatControl.Type.MASTER_GAIN);
        // Increase the volume by 6dB (adjust the value as needed)
        gainControl.setValue(6.0f);

        clip2.start();
      } catch (IOException | UnsupportedAudioFileException | LineUnavailableException e) {
        e.printStackTrace();
      }

      Attributes.increaseSoldierly(1);
      attributes.displayStats();
    }

    else if (toyChoice.equals("C")) {
      System.out.println(
          "You grabbed for the tiny top-hat and took delight in plopping it upon head, as you cutely said: Hip-Hip!");

      try {
        File file2 = new File("Audio\\half-slave-half-free.wav");
        AudioInputStream audioStream2 = AudioSystem.getAudioInputStream(file2);
        Clip clip2 = AudioSystem.getClip();
        clip2.open(audioStream2);
        clip2.start();
      } catch (IOException | UnsupportedAudioFileException | LineUnavailableException e) {
        e.printStackTrace();
      }

      attributes.increasePolitical(1);
      attributes.displayStats();

    }

    Thread.sleep(3000);

    System.out.println(
        "Another year has gone by and you are 2 years of age.\nYou and your older sister, Elizabeth,\nas well as your father, are spending an afternoon splashing around in a pond near by your home, as well as skipping rocks.\n"
            +
            "Do you wish to spend more time swimming or skipping rocks?\nA: swimming\nB: skipping rocks");

    Scanner scannerpondChoice = new Scanner(System.in);
    String pondChoice = scannerpondChoice.nextLine();

    if (pondChoice.equals("A")) {
      System.out.println("You spent the majority of the time at the pond swimming in the pleasant spring weather.");

      Attributes.increaseAgility(1);
      // System.out.println("Your current Agility stat: " + attributes.Agility);
      attributes.displayStats();
    }

    else if (pondChoice.equals("B")) {
      System.out
          .println("You spent the majority of the time at the pond skipping rocks in the pleasant spring weather.");

      Attributes.increaseStrength(1);
      // System.out.println("Your current Strength stat: " + attributes.Strength);
      attributes.displayStats();
    }
    Thread.sleep(3000);

    System.out.println(
        "The next day, your sister began to feel rather ill and your father was worried for the worst\nand called upon the local doctor to take a look at Elizabeth.");
    System.out.println(
        "The doctor diagnosed Elizabeth with Typoid Fever, an illness caused by a bacteria very much like the one that causes food-poisoning.\nIt is a serious illness that claims many lives at this time in hitory.");
    Thread.sleep(3000);
    System.out.println(
        "It is March 3rd, 1826 and Elizabeth's situation is not looking promising.\nYour father and mother are doing all they can to nurse her.");
    System.out.println(
        "Being that you are just a 2 year old, you are incapable of doing anything to help your sister,\nbut you react to your sister's serious illness in the following manner:");
    System.out.println("A: You tell Elizabeth that you love her and hold her hand, and give her a kiss on the head.");
    System.out.println("B: You pray to God, that Elizabeth will be spared, and you tell Elizabeth you love her.");
    System.out.println("C: You do nothing.");
    System.out.println("D: You ask Elizabeth if you can have her toys if she dies.");

    Scanner scannersisChoice = new Scanner(System.in);
    String sisChoice = scannersisChoice.nextLine();

    if (sisChoice.equals("A")) {

      Attributes.increasePersonable(2);
      attributes.displayStats();
    }

    else if (sisChoice.equals("B")) {

      Attributes.increasePersonable(1);
      Attributes.increaseReligiousness(1);
      attributes.displayStats();
    }

    else if (sisChoice.equals("C")) {

      attributes.decreasePersonable(1);
      attributes.displayStats();
    }

    else if (sisChoice.equals("D")) {

      attributes.increaseEvil(1);
      attributes.displayStats();
    }

    Thread.sleep(3000);

    Chances chances = new Chances();
    sisterLive = chances.ChanceUnlikely();
    // String name = main.getName(); // calling the getname function from main
    if (sisterLive == 'y') {
      System.out.println(
          "After several days of your father and mother nursing young Elizabeth,\nshe started to take a turn for the better and regained her health!\nOn March 6th, The Doctor said that he expects Elizabeth to make a full recovery! Thanks be to...\nA: God\nB: Fate");

      attributes.increaseLuck(1);

      Scanner scannerthanksToWho = new Scanner(System.in);
      String thanksToWho = scannerthanksToWho.nextLine();

      if (thanksToWho.equals("A")) {
        attributes.increaseReligiousness(1);

      } else {
        attributes.decreaseReligiousness(1);

      }
      Thread.sleep(3000);
      System.out.println(
          "To make matters worse, not long after your sister recovered from the terrible fever,\nyour father became sick with the same illness.");
    } else {
      System.out.println(
          "After several days of your father and mother nursing young Elizabeth,\nshe took a turn for the worst and on 6th of March, 1826, she passed away.");
      attributes.increaseStrength(1);

      Thread.sleep(3000);
      System.out.println("The next day, you ask your parents what happened to Elizabeth.");

      // String name = main.getName();
      System.out.println("Your mother and father, in their grief stricken emotions, say to you:\n\"Little " + name
          + ", your sister went off to be with the Lord.\"");
      System.out.println(
          "To make matters worse, not long after your sister passed, your father became sick with the same illness.");

    }
    Thread.sleep(3000);
    System.out
        .println("It is March 25th and your father is fighting for his life.\nHe knows that his situation is grim.\n" +
            "Your father has your mother bring you over to his bed side, and he says in a failing voice: \"My son, I love you more than life itself.\nDo not mourn me dead. Just be the best...the best..."
            +
            "*Cough* *Cough*\" Your father began fading in to a sleepy delerium.");
    Thread.sleep(3000);
    System.out.println(
        "Not long after this, your mother ran to summon the doctor, and at 1 in the moring on March 26th, your father, Jonathan passed away.");
    Thread.sleep(3000);
    System.out.println(
        "You never got to hear what your father wanted you to be the best at. However, you choose to assume that he was going to tell you to be the BEST:\n"
            +
            "A: Leader, you can be.\nB: Man of God, you can be.\nC: Brave man, you can be.\nD: Scoundrel, you can be.");

    Scanner scannerbeBest = new Scanner(System.in);
    String beBest = scannerbeBest.nextLine();

    if (beBest.equals("A")) {
      System.out.println("You take it to heart: that you should be the \"best leader\" you can be.");
      attributes.increaseLeadership(3);
    } else if (beBest.equals("B")) {
      System.out.println("You take it to heart: that you should be the \"best man of God\" you can be.");
      attributes.increaseReligiousness(3);
    } else if (beBest.equals("C")) {
      System.out.println("You take it to heart: that you should be the \"bravest man\" you can be.");
      attributes.increaseBravery(3);
    } else if (beBest.equals("D")) {
      System.out.println("You take it to heart: that you should be the \"best scoundrel\" you can be.");
      attributes.increaseEvil(3);
    }
    attributes.displayStats();
    Thread.sleep(3000);
    System.out.println(
        "With all new death, there is new life.\nYour mother gave birth to your yonger sister, Laura, the next day, March 27th.");
    Thread.sleep(3000);
    System.out.println(
        "unfortunately, with the death of your father, your mother is left widowed and in much debt.\nShe is forced to sell off many of the"
            +
            " family possesions, including your toys, to make ends meet.\nShe says that you're only allowed to keep one toy.\nWhich one will it be?\n"
            +
            "A: soldier\nB: top-hat\nC: train");

    Scanner scannerkeepToy = new Scanner(System.in);
    keepToy = scannerkeepToy.nextLine();

    if (keepToy.equals("A")) {

      try {
        File file2 = new File("Audio\\Rifle-Musket-Fire-Volley.wav");
        AudioInputStream audioStream2 = AudioSystem.getAudioInputStream(file2);
        Clip clip2 = AudioSystem.getClip();
        clip2.open(audioStream2);

        FloatControl gainControl = (FloatControl) clip2.getControl(FloatControl.Type.MASTER_GAIN);
        // Increase the volume by 6dB (adjust the value as needed)
        gainControl.setValue(6.0f);

        clip2.start();
      } catch (IOException | UnsupportedAudioFileException | LineUnavailableException e) {
        e.printStackTrace();
      }

      attributes.increaseSoldierly(1);
      keepToy = "soldier";
    } else if (keepToy.equals("B")) {

      try {
        File file2 = new File("Audio\\half-slave-half-free.wav");
        AudioInputStream audioStream2 = AudioSystem.getAudioInputStream(file2);
        Clip clip2 = AudioSystem.getClip();
        clip2.open(audioStream2);
        clip2.start();
      } catch (IOException | UnsupportedAudioFileException | LineUnavailableException e) {
        e.printStackTrace();
      }
      attributes.increasePolitical(1);
      keepToy = "top-hat";
    } else if (keepToy.equals("C")) {

      try {
        File file2 = new File("Audio\\Wooden-Train-Whistle.wav");
        AudioInputStream audioStream2 = AudioSystem.getAudioInputStream(file2);
        Clip clip2 = AudioSystem.getClip();
        clip2.open(audioStream2);
        clip2.start();
      } catch (IOException | UnsupportedAudioFileException | LineUnavailableException e) {
        e.printStackTrace();
      }

      attributes.increaseIndustrious(1);
      keepToy = "train";
    }
    attributes.displayStats();
    Thread.sleep(3000);
    System.out
        .println(
            "Your mother was likewise compelled to move the family in to a tiny, rented, one-room house in town.\nFor the next 4 years"
                +
                " your mother supported you, your sister(s), and brother by taking in sewing and running a private school.");

    Thread.sleep(3000);
    System.out
        .println(
            "When you were 6 years old, in 1830, your mother fell in love and remarried to a man named Blake Woodson, an attorney.");
    Thread.sleep(3000);
    System.out.println(
        "Woodson does not take a liking towards you and your siblings, and truly wants nothing to do with you all");
    System.out.println(
        "Woodson convinces your mother, who is in really poor health, to send your older brother, Warren, to live with his uncle in Parkersburg.");
    System.out.println(
        "Likewise, you and your little sister are to live with your grandmother in Lewis County, with her unmarried daughters and sons.\nYour mother is too sick to care for you and your siblings.");
    Thread.sleep(9000);
    System.out.println(
        "One of the sons of your grandmother, Jacob, arrives in Clarksburg to take you and your sister(s) to your new home, apart from your mother.");
    System.out.println(
        "How do you react?\nA: You run and hide in the woods near by your home.\nB: You tell your mom that you love her and reluctantly go with your grandma's son.");

    Scanner scannerMother = new Scanner(System.in);
    String Mother = scannerMother.nextLine();
    int counterSpeech = 1;
    int counter = 0;
    if (Mother.equals("A")) {

      try {
        File file2 = new File("Audio\\run-in-forrest.wav");
        AudioInputStream audioStream2 = AudioSystem.getAudioInputStream(file2);
        Clip clip2 = AudioSystem.getClip();
        clip2.open(audioStream2);
        clip2.start();
      } catch (IOException | UnsupportedAudioFileException | LineUnavailableException e) {
        e.printStackTrace();
      }

      attributes.increaseAgility(1);
      attributes.displayStats();
      Thread.sleep(3000);
      String Motherwoods;

      System.out.println("Now, in the woods, hiding away, you meditate on the circumstances of the moment.");
      System.out.println(
          "As night fall starts to close in, you hear someone creeping up on you.\nStartled, you turn to look and see Jacob standing with folded arms and a concerned look.");
      // String name = main.getName();
      do {
        if (counterSpeech == 1) {
          System.out.println("C'mon now little " + name
              + ", you will be safe with me. Your mother needs you to come live with me now, okay?\n" +
              "You say to Jacob:\nA: Go away you scoundrel, as you suck your thumb.\nB: *Sigh, okay I will come with you.");

        } else {
          System.out.println("For the " + counterSpeech + " time, " + name + ", c'mon...");
        }
        Scanner scannerMotherwoods = new Scanner(System.in);
        Motherwoods = scannerMotherwoods.nextLine();

        if (Motherwoods.equals("A")) {
          counter++;
          counterSpeech++;
        }

      } while (Motherwoods.equals("A") && counter < (10));

      if (Motherwoods.equals("B")) {
        System.out.println("Jacob says:\"" + name + ", thank you. You sure are one hell of a runner though!\"");
        Thread.sleep(3000);
        attributes.decreasePersonable(counter);
        attributes.displayStats();
        Thread.sleep(3000);
      }
    }

    if (counter == 10) {
      Thread.sleep(3000);
      attributes.decreasePersonable(counter);
      attributes.displayStats();
      Thread.sleep(3000);
      System.out.println("Jacob: \"Okay, you little shit!\"");
      System.out.println("**Jacob snatches you up and puts you on his shoudler**");
      System.out.println("**You kick and scream as Jacob carries you back to the house**");
      Thread.sleep(3000);
      attributes.increaseStrength(5);
      attributes.displayStats();
      Thread.sleep(18000);
    }

    System.out.println(
        "You, your sister(s), and Jacob stay the night at your mother's home and leave for Lewis County the next morning");
    System.out.println("You tell your mother goodbye, and you hope it is not the last.");
    Thread.sleep(3000);
    System.out.println(
        "By horse and buggy, you and your sister(s) are traveling to your grandma's. The trip is several days of travel away.");

    try {
      File file2 = new File("Audio\\horse-buggy-long.wav");
      AudioInputStream audioStream2 = AudioSystem.getAudioInputStream(file2);
      clip2 = AudioSystem.getClip();
      clip2.open(audioStream2);
      clip2.start();
    } catch (IOException | UnsupportedAudioFileException | LineUnavailableException e) {
      e.printStackTrace();
    }
    Thread.sleep(6000);

    System.out.println("On the way to your grandmother's you and Jacob fell in to conversation.");
    if (counterSpeech > 1) {
      System.out.println(
          "Jacob says to you: \"Where did you learn to call people scoundrels, You had me concerned back there in the forrest, little "
              + name + ".\"");
      Thread.sleep(6000);
      System.out.println("You say:\nA: I don't know sir, I was just scared. I'm sorry.\nB: You are a scoundrel!");

      Scanner scannerwhyScoundrel = new Scanner(System.in);
      String whyScoundrel = scannerwhyScoundrel.nextLine();

      if (whyScoundrel.equals("A")) {
        System.out.println("Jacob: \"It's okay buddy, I know this is hard for you.\"");
        attributes.increasePersonable(1);
        attributes.displayStats();
      } else {

        try {
          File file2 = new File("Audio\\slapped.wav");
          AudioInputStream audioStream2 = AudioSystem.getAudioInputStream(file2);
          Clip clip3 = AudioSystem.getClip();
          clip3.open(audioStream2);
          clip3.start();
        } catch (IOException | UnsupportedAudioFileException | LineUnavailableException e) {
          e.printStackTrace();
        }

        System.out.println(
            "Jacob: \"Oh, that is it you little runt!\"\n**Jacob then slaps you in the face**\nJacob: \"You will learn respect, and you will like it.\"");
        Thread.sleep(6000);
        attributes.increaseStrength(1);
        attributes.displayStats();
      }

    }
    Thread.sleep(6000);
    System.out.println("Jacob: \"You know buddy, you are gonna be safe and sound with me.\"");
    System.out.println("**Jacob reaches in to his coat pocket and pulls out a flask of whisky**");
    System.out.println("Jacob: \"Take a swig or two of this kid.\"");
    System.out.println("You say:\nA: \"Oh, uh, okay!\"\nB: \"No thanks, sir.\"");

    Scanner scannerswigOrNot = new Scanner(System.in);
    String swigOrNot = scannerswigOrNot.nextLine();
    char holdItDown = '?';
    if (swigOrNot.equals("A")) {
      System.out.println("Jacob, with a fat grin on his face, hands you the flask of whisky.");
      Thread.sleep(3000);
      System.out.println("You take healthy sip of the corn-based liquor, and immediantly gag.");
      Thread.sleep(3000);

      if (attributes.Strength > 4) {
        System.out.println("You manage to hold it in, and take the liquid down");
        holdItDown = 'y';
        System.out.println("Jacob: \"Atta, kid! You got quite the stomach!\"");
        System.out.println("**Jacob cackles like a chicken, in laughter**");
        attributes.increasePersonable(1);
      }

      if (attributes.Strength < 5) {
        System.out.println("**In an unparalleled disgust, you spat the liquid all over Jacob's face**");
        attributes.decreasePersonable(1);
        Thread.sleep(3000);
        try {
          File file2 = new File("Audio\\spitting-liquid.wav");
          AudioInputStream audioStream2 = AudioSystem.getAudioInputStream(file2);
          Clip clip4 = AudioSystem.getClip();
          clip4.open(audioStream2);
          clip4.start();
        } catch (IOException | UnsupportedAudioFileException | LineUnavailableException e) {
          e.printStackTrace();
        }
        System.out.println("Jacob: \"OH, MY, JESUS CHRIST!!!\"");
        System.out.println("**Jacob stops the horse and buggy.**");
        clip2.stop();
        Thread.sleep(3000);
        System.out.println("**Your sister(s) are watching in silent terror**");
        Thread.sleep(3000);
        System.out.println("\"Get out!\", Jacob orders you.");
        System.out.println(
            "Jacob: \"You are gwinna be walkin' the next couple miles, and that's that, you got that, " + name + "?\"");
        Thread.sleep(3000);
        if (sisterLive == 'y') {
          System.out.println("**Your sister Elizabeth chimes in.**");
          System.out.println(
              "Elizabeth: \"Uncle Jacob! You are the meanest man in the whole world! I hate you and I'm going home to tell my momma\nwhat you are doing to "
                  + name + "!\"");
          System.out.println("**Elizabeth hops out of the buggy**");
          Thread.sleep(3000);
          System.out.println(
              "Jacob: \"Wait, wait, hold on there missy...I, uh, I'm just tryna giving you all a good laugh.\nThere qwinna be no need for that, hop on back in the buggie. "
                  + name + ", stay in the buggie.");
          System.out.println("**Elizabeth, with teary eyes and red face, climbs back in.**");
          Thread.sleep(3000);

        }
        if (sisterLive == 'n') {
          System.out.println(
              "How do you respond:\nA: \"Uncle, Jacob, I am sorry, I didn't mean to, please!\"\nB: \"Yes sir.\"");
          Scanner scannergetOutBuggy = new Scanner(System.in);
          String getOutBuggy = scannergetOutBuggy.nextLine();

          if (getOutBuggy.equals("A")) {
            System.out.println("**Jacob looks at you in disgust.**");
            System.out.println(
                "Jacob: \"If you are gwinna stay in this buggy with me for the next couple o' miles, you gwinna prove yourself a real man, you hear?\"");
            System.out.println("**Jacob hands you the flask of whisky.**");
            Thread.sleep(3000);
            System.out.println("Jacob: \"Chug the rest, and not a single drop best be spilling.\"");
            System.out.println("**You drink the rest of the whisky, somehow managing to hold it down.**");
            Thread.sleep(3000);
            System.out.println("Jacob: \"Now that is how a real man behaves.\"");
            System.out.println("**Jacob explodes in to manical laughter.**");
            Thread.sleep(3000);

            attributes.increaseStrength(1);
          } else {
            System.out.println("**You hop out of the buggy**");
            System.out.println("Jacob: \"You qwinna be walkin' till I say you can come back in\"");
            Thread.sleep(3000);
            System.out.println("**Jacob starts the horses back in motion, with you walking beside**");
            Attributes.increasePersonable(1);
            Attributes.increaseAgility(1);
            Thread.sleep(3000);
            System.out.println("**You walk the next 2 hours and hop back in the buggy.**");
          }
        }
      }

    } else {
      System.out.println("Jacob: \"You are such a little wimp, kid.\"");
      System.out.println("**Jacob opens the flask and chugs the whole of the whisky.**");
      System.out.println("Jacob: \"You gwinna have a lot to learn " + name + ".");
    }
    Thread.sleep(3000);
    System.out.println(
        "**After 8 hours of traveling, you, Jacob, and your sister(s) find a nice spot to camp for the night**");
    System.out.println(
        "You spend your night:\nA: Playing with the toy you got to keep from your mom.\nB: Meditating in your thoughts.");

    Scanner scannerbuggyToy = new Scanner(System.in);
    String buggyToy = scannerbuggyToy.nextLine();

    if (buggyToy.equals("A")) {
      System.out.println("**You spend an hour before you fall asleep playing with your toy " + keepToy + ".**");
      switch (keepToy) {
        case "soldier":
          System.out.println(
              "**You march your soldier around the ground, imagining it to be yourself-fighing in the American Revolution.**");
          Attributes.increaseSoldierly(1);
          break;
        case "train":
          System.out.println(
              "**You roll your toy train around, imagining that you are a conductor on a great steel horse.**");
          Attributes.increaseIndustrious(1);
          break;
        case "top-hat":
          System.out
              .println(
                  "**You place your top-hat on your head and wear it proudly, thinking of the presidents of old.**");
          Attributes.increasePolitical(1);
          break;
      }
    } else {
      System.out.println("**You spend an hour before bed meditating deep in your thoughts.**");
      Attributes.increaseIntelligence(1);
    }
    System.out.println(
        "**You, your sisters, and Jacob wake up the next morning and continue your drive to your grandma's house.**");
    System.out.println("**After another 2 days of travel, you finally arrive in Lewis County.**");
    System.out.println(
        "**You and your sister jump out of the buggy, as you arrive at your grandma's house, and enter the home.**");
    System.out.println("**Your grandma is waiting in the front parlor with the warmest smile you have ever seen.**");
    String greatStat = attributes.grabGreatestStat();
    System.out.println("Grandma: \"Oh, little " + name + ", how " + greatStat + " you look!");

    switch (greatStat) {
      case "Soldierly":
        System.out.println(
            "Grandma: \"I've missed my little soldier so much!\"");
        Attributes.increaseSoldierly(1);
        break;
      case "Industrious":
        System.out.println(
            "Grandma: \"I've missed my little tycoon so much!\"");
        Attributes.increaseIndustrious(1);
        break;
      case "Political":
        System.out
            .println(
                "Grandma: \"I've missed my little president so much!\"");
        Attributes.increasePolitical(1);
        break;
    }
    Thread.sleep(3000);
    System.out.println(
        "**You hug your grandma and walk in to the living room where your uncle Ryan and aunts Jan and Loanna are sitting around the dining table**");
    System.out.println("Uncle Ryan: \"So there's my young nephew, how was your trip buddy?\"");
    System.out.println("How do you respond:\nA: \"It was good.\"\nB: \"Uncle Jacob...\"");

    Scanner scannerhowBuggyTrip = new Scanner(System.in);
    String howBuggyTrip = scannerhowBuggyTrip.nextLine();
    if (howBuggyTrip.equals("A")) {
      System.out.println(
          "Uncle Ryan: \"I'm glad! What do you say you sit down with us and get some good food in you, I'm sure you are hungry!\"");
      System.out.println("A: \"I'm okay, I'm tired and ready for bed.\"\nB: \"Oh yeah, I'm starving!\"");

      Scanner scannerhungryOrNot = new Scanner(System.in);
      String hungryOrNot = scannerhungryOrNot.nextLine();
      Thread.sleep(3000);
      switch (hungryOrNot) {
        case "A":
          System.out.println(
              "Uncle Ryan: \"Alright, " + name + ". I'll see you in the morning, I have a suprise for you tomorrow!\"");

          break;

        case "B":
          System.out.println(
              "Uncle Ryan: \"Great! Your grandma and aunts are gonna set up the food now! We are having a feast!\"");
          System.out.println(
              "**You, your sister(s), your grandma and her sons/daughters have a wonderful evening filled with delicious foods and great laughter.**");
          Attributes.increasePersonable(1);
      }
    } else {
      System.out.println("Uncle Ryan: \"Ah, I see. I would recommend you stay away from your uncle Jacob, " + name
          + ". He will turn you in to a scoundrel.\"");
      System.out.println("Uncle Ryan: \"And you don't want to be a scoundrel do you?\"");
      System.out
          .println("You say:\nA: \"No sir, I will never be a scoundrel!\"\nB: \"I don't know, uncle Jacob is fun!\"");

      Scanner scannerbeAScoundrel = new Scanner(System.in);
      String beAScoundrel = scannerbeAScoundrel.nextLine();

      switch (beAScoundrel) {
        case "A":
          attributes.decreaseEvil(1);
          System.out.println("Uncle Ryan: \"Thatta boy!\"");
          break;

        case "B":
          Attributes.increaseEvil(1);
          System.out.println("Uncle Ryan: \"Oh jeez, I'm gonna have to talk to your uncle Jacob now.\"");

          break;
      }

      System.out.println(
          "Uncle Ryan: \"What do you say you sit down with us and get some good food in you, I'm sure you are hungry!\"");
      System.out.println("A: \"I'm okay, I'm tired and ready for bed.\"\nB: \"Oh yeah, I'm starving!\"");

      Scanner scannerhungryOrNot = new Scanner(System.in);
      String hungryOrNot = scannerhungryOrNot.nextLine();

      switch (hungryOrNot) {
        case "A":
          System.out.println(
              "Uncle Ryan: \"Alright, " + name + ". I'll see you in the morning, I have a suprise for you tomorrow!\"");

          break;

        case "B":
          System.out.println(
              "Uncle Ryan: \"Great! Your grandma and aunts are gonna set up the food now! We are having a feast!\"");
          System.out.println(
              "**You, your sister(s), your grandma and her sons/daughters have a wonderful evening filled with delicious foods and great laughter.**");
          Attributes.increasePersonable(1);
      }
    }
    Thread.sleep(3000);
    System.out.println(
        "**You retire to bed for the night and are sleeping in the guest room with your siblings.\nYou notice a book shelf with a couple of different books.**");
    System.out.println(
        "**There are several books on the shelf to read, however your grandma would not be happy to find you awake at such a late hour.\nDo you take the risk in reading the books?**");
    System.out.println("A: Yes\nB: No");
    Scanner scannerriskRead = new Scanner(System.in);
    String riskRead = scannerriskRead.nextLine();

    switch (Attributes.Luck) {

      case 0:
        grandmaCatchesYou = chances.ChanceEven();
        System.out.println("Based on your \"LUCK\" stat, you have a 50% chance of not being caught.");
        break;

      case 1:
        grandmaCatchesYou = chances.ChanceUnlikely();
        System.out.println("Based on your \"LUCK\" stat, you have a 75% chance of not being caught.");
        break;
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
      case 8:
      case 9:
      case 10:
      case 11:
      case 12:
      case 13:
      case 14:
      case 15:
        grandmaCatchesYou = chances.ChanceSlim();
        System.out.println("Based on your \"LUCK\" stat, you have a 90% chance of not being caught.");
        break;
    }

    switch (riskRead) {
      case "A":
        if (grandmaCatchesYou == 'n') {
          System.out.println(
              "Which of the following books do you want to read?\nA: Napoleon Bonaparte's Memoirs\nB: Holy Bible\nC: The Art of War\nD: How to Run a Successful Plantation\nE: The Constitution of the U.S.\nF: Rising above your social status");
          Scanner scannerwhichBookRead = new Scanner(System.in);
          String whichBookRead = scannerwhichBookRead.nextLine();
          switch (whichBookRead) {

            case "A":
              System.out.println(
                  "**The brilliant tacical manuevers of Napoleon's army at The Battle of Austerlitz fills your cranium with knowledge.**");
              Attributes.increaseIntelligence(1);
              Attributes.increaseTactician(1);
              break;

            case "B":
              System.out
                  .println("**The holy scriptures of the old and new testaments fill your cranium with knowledge.**");
              Attributes.increaseIntelligence(1);
              Attributes.increaseReligiousness(1);
              break;

            case "C":
              System.out.println("**The old classic on the art of war fills your cranium with knowledge.**");
              Attributes.increaseIntelligence(1);
              Attributes.increaseSoldierly(1);
              break;

            case "D":
              System.out.println("**The \"how to\" guide fill your cranium with knowledge.**");
              Attributes.increaseIntelligence(1);
              Attributes.increaseIndustrious(1);
              break;

            case "E":
              System.out.println("**The founding document of the U.S. fills your cranium with knowledge.**");
              Attributes.increaseIntelligence(1);
              Attributes.increasePolitical(1);
              break;

            case "F":
              System.out.println("**The guide on rising above your social status fills your cranium with knowledge.**");
              Attributes.increaseIntelligence(1);
              Attributes.increaseSocialStatus(1);
              break;

          }

        } else if (grandmaCatchesYou == 'y') {
          System.out.println(
              "**You starting reading some of the books from the bookshelf and your grandma came in to the room to find you.**");
          System.out.println("Grandma: \"Little " + name + ", you are supposed to be in bed!\"");
          attributes.decreasePersonable(1);
          System.out.println("**You go to sleep for the night.**");
        }

        break;

      case "B":
        System.out.println("**You go to sleep for the night.**");
        Thread.sleep(3000);
        break;
    }

    System.out.println(
        "**You wake up the next morning to your grandma calling you for breakfast.**");
    System.out
        .println("Grandma: \"" + name + ", your uncle Ryan wanted me to give you a present!\"");
    System.out.println(
        "Grandma: \"He bought you this amazing almanac with a seemingly endless amount of information.\nWhenever you have a certain amount of EXPERIENCE, you can read the almanac to gain new SKILLS.\"");
    System.out.println("**You have obtained the \"SKILLS ALMANAC\".**");
    System.out.println("**You have gained 100 experience**");
    Skills.expIncrease(100);
    attributes.displayStats();
    System.out.println("Grandma: \"I know you will do great things my little " + name + "!");
    System.out.println(
        "Grandma: \"Oh and one more thing, I forgot to tell you that you are going to be living with your uncle, Cummins, at the\nold family mill just a couple of miles away from here in a couple of months.\"");
    System.out.println(
        "Grandma: \"So, enjoy your time here buddy, and go explore the place! Just make sure that you don't go down to the old graveyard past the Nimmitsburg Road.\nThere are stories of childern going missing back there and your mother and I don't need to lose you too.");
    System.out.println("**You finish eating breakfast with your grandma and walk outside the house**");
    GrandmaHouse();
  }

  public static void GrandmaHouse() {

    System.out.println("**You are on the front steps of your grandma's house.**");
    System.out.println("A: Go inside the house\nB: Go to the garden\nC: Go down the Lafeyette Road");

    Scanner scannerGrandmaHouseFrontSteps = new Scanner(System.in);
    String GrandmaHouseFrontSteps = scannerGrandmaHouseFrontSteps.nextLine();

    if (GrandmaHouseFrontSteps.equalsIgnoreCase("A")) {
      goInsideHouse();
    } else if (GrandmaHouseFrontSteps.equalsIgnoreCase("B")) {
      goToGarden();
    } else if (GrandmaHouseFrontSteps.equalsIgnoreCase("C")) {
      goDownLafayetteRoad();
    } else {
      System.out.println("Invalid choice. Please try again.");
      GrandmaHouse(); // Restart the method if the choice is invalid
    }
  }

  public static void goInsideHouse() {
    System.out.println("**You entered the house.**");

    if (enteringgrandmahousecounter > 0) {
      System.out.println("Grandma: \"" + name
          + ", We are packed up and ready to bring you to your uncle Cummins mill whenever you are ready!\"\nA: Go to Cummins' mill\nB: Don't go to Cummins' mill");
      Scanner scannergoToMill = new Scanner(System.in);
      String goToMill = scannergoToMill.nextLine();

      if (goToMill.equalsIgnoreCase("A")) {
        System.out.println("ATTENTION PLAYER: Cummins' mill path has not been developed yet.");
      } else if (goToMill.equalsIgnoreCase("B")) {
        System.out.println("Grandma: \"Okay " + name + ", come see me when you are ready!\"");
      }

    }

    enteringgrandmahousecounter++;

    System.out.println("A: Walk out the front door\nB: Head up the stairs\nC: Walk to the kitchen");

    Scanner scannerJustInTheHouse = new Scanner(System.in);
    String JustInTheHouse = scannerJustInTheHouse.nextLine();

    if (JustInTheHouse.equalsIgnoreCase("A")) {
      GrandmaHouse();
    } else if (JustInTheHouse.equalsIgnoreCase("B")) {
      grandmaUpStairs();
    } else if (JustInTheHouse.equalsIgnoreCase("C")) {
      grandmaKitchen();
    } else {
      System.out.println("Invalid choice. Please try again.");
      goInsideHouse(); // Restart the method if the choice is invalid
    }
  }

  public static void goToGarden() {
    System.out.println("**You entered the garden.**");
    System.out.println("ATTENTION PLAYER: GARDEN HAS NOT BE DEVELOPED YET.");

    GrandmaHouse();
  }

  public static void goDownLafayetteRoad() {
    System.out.println("**You start walking down the road leading from the house.**");
    if (sisterLive == 'y') {
      System.out.println("**You see your sister Elizabeth and aunt Loanna walking toward you.**");
      System.out.println("Aunt Loanna: \"" + name
          + "! Have fun exploring the place! Just don't go to the cemetary past Nemmitsburg Road.\"");
      System.out.println("Elizabeth: \"Stay safe " + name + ", I love you!");
    }

  }

  public static void grandmaUpStairs() {
    System.out.println("**You walked up the creaky stair case.**");

    if (goingupstairscounter == 0) {
      System.out.println(
          "**At the top of the stair case you notice a paiting of a man in military uniform mounted to the wall.**");
      System.out.println("**At the bottom of the painting it says \"War of 1812: Hero of New Orleans\".**");
      System.out.println("**You wonder who the painting could be of.**");
      System.out.println("A: General Albert Green\nB: General Simon Stripestead\nC: General Andrew Jackson");
      Scanner scannerpainting = new Scanner(System.in);
      String painting = scannerpainting.nextLine();

      if (painting.equalsIgnoreCase("C")) {
        Attributes.increaseIntelligence(1);
      }
      System.out.println("**You look on the side of the painting and read the name: \"Andrew Jackson\".**");
      goingupstairscounter++;
    }

    System.out.println(
        "A: Go to your room\nB: Go to your uncle Jacob's room\nC: Go to your uncle Ryan's room\nD: Walk down the stairs");

    Scanner scannerupstairsGoRoom = new Scanner(System.in);
    String upstairsGoRoom = scannerupstairsGoRoom.nextLine();

    if (upstairsGoRoom.equals("A")) {
      System.out.println("**You walk in to your room.**");
      System.out.println("A: Scan the book shelf\nB: Hop in your bed\nC: Play with the toy your mom got you");

      Scanner scannerwhatDoInRoom = new Scanner(System.in);
      String whatDoInRoom = scannerwhatDoInRoom.nextLine();

      if (whatDoInRoom.equalsIgnoreCase("A")) {
        bookShelfGrandmaHouse();
      } else if (whatDoInRoom.equalsIgnoreCase("B")) {
        goToBedGrandma();
      } else if (whatDoInRoom.equalsIgnoreCase("C")) {
        toyGrandmaHouse();
      }
    } else if (upstairsGoRoom.equalsIgnoreCase("B")) {
      // uncle jacob's room
    } else if (upstairsGoRoom.equalsIgnoreCase("C")) {
      // uncle ryan's room
    } else if (upstairsGoRoom.equalsIgnoreCase("D")) {

      System.out.println("A: Walk out the front door\nB: Head up the stairs\nC: Walk to the kitchen");

      Scanner scannerJustInTheHouse = new Scanner(System.in);
      String JustInTheHouse = scannerJustInTheHouse.nextLine();

      if (JustInTheHouse.equalsIgnoreCase("A")) {
        GrandmaHouse();
      } else if (JustInTheHouse.equalsIgnoreCase("B")) {
        grandmaUpStairs();
      } else if (JustInTheHouse.equalsIgnoreCase("C")) {
        grandmaKitchen();
      }

    }

  }

  public static void bookShelfGrandmaHouse() {
    if (bookshelf) {
      bookshelf = !bookshelf;
      System.out.println(
          "Which of the following books do you want to read?\nA: Napoleon Bonaparte's Memoirs\nB: Holy Bible\nC: The Art of War\nD: How to Run a Successful Plantation\nE: The Constitution of the U.S.\nF: Rising above your social status");
      Scanner scannerwhichBookRead = new Scanner(System.in);
      String whichBookRead = scannerwhichBookRead.nextLine();
      switch (whichBookRead) {

        case "A":
          System.out.println(
              "**The brilliant tacical manuevers of Napoleon's army at The Battle of Austerlitz fills your cranium with knowledge.**");
          Attributes.increaseIntelligence(1);
          Attributes.increaseTactician(1);
          break;

        case "B":
          System.out
              .println("**The holy scriptures of the old and new testaments fill your cranium with knowledge.**");
          Attributes.increaseIntelligence(1);
          Attributes.increaseReligiousness(1);
          break;

        case "C":
          System.out.println("**The old classic on the art of war fills your cranium with knowledge.**");
          Attributes.increaseIntelligence(1);
          Attributes.increaseSoldierly(1);
          break;

        case "D":
          System.out.println("**The \"how to\" guide fill your cranium with knowledge.**");
          Attributes.increaseIntelligence(1);
          Attributes.increaseIndustrious(1);
          break;

        case "E":
          System.out.println("**The founding document of the U.S. fills your cranium with knowledge.**");
          Attributes.increaseIntelligence(1);
          Attributes.increasePolitical(1);
          break;

        case "F":
          System.out.println("**The guide on rising above your social status fills your cranium with knowledge.**");
          Attributes.increaseIntelligence(1);
          Attributes.increaseSocialStatus(1);
          break;
      }

    } else {
      System.out.println("**You attempt to read the books but are too tired to focus.**");
    }
    System.out.println("A: Scan the book shelf\nB: Hop in your bed\nC: Play with the toy your mom got you");

    Scanner scannerwhatDoInRoom = new Scanner(System.in);
    String whatDoInRoom = scannerwhatDoInRoom.nextLine();

    if (whatDoInRoom.equalsIgnoreCase("A")) {
      bookShelfGrandmaHouse();
    } else if (whatDoInRoom.equalsIgnoreCase("B")) {
      goToBedGrandma();
    } else if (whatDoInRoom.equalsIgnoreCase("C")) {
      toyGrandmaHouse();
    }

  }

  public static void toyGrandmaHouse() {
    if (bookshelf) {
      bookshelf = !bookshelf;
      System.out.println("**You spend an hour playing with your toy " + keepToy + ".**");
      switch (keepToy) {
        case "soldier":
          System.out.println(
              "**You march your soldier around the ground, imagining it to be yourself-fighing in the American Revolution.**");
          Attributes.increaseSoldierly(1);
          break;
        case "train":
          System.out.println(
              "**You roll your toy train around, imagining that you are a conductor on a great steel horse.**");
          Attributes.increaseIndustrious(1);
          break;
        case "top-hat":
          System.out
              .println(
                  "**You place your top-hat on your head and wear it proudly, thinking of the presidents of old.**");
          Attributes.increasePolitical(1);
          break;
      }
    } else {
      System.out.println("**You attempt to play with your toy but are too tired to focus.**");
    }
    System.out.println("A: Scan the book shelf\nB: Hop in your bed\nC: Play with the toy your mom got you");

    Scanner scannerwhatDoInRoom = new Scanner(System.in);
    String whatDoInRoom = scannerwhatDoInRoom.nextLine();

    if (whatDoInRoom.equalsIgnoreCase("A")) {
      bookShelfGrandmaHouse();
    } else if (whatDoInRoom.equalsIgnoreCase("B")) {
      goToBedGrandma();
    } else if (whatDoInRoom.equalsIgnoreCase("C")) {
      toyGrandmaHouse();
    }

  }

  public static void goToBedGrandma() {
    System.out.println("**You get in your nice and cozy bed.**");

    if (sleepcounter == 0) {
      System.out.println("**There is a 100% chance you fall asleep**");
      check = 'y';
      if (check == 'y') {
        sleepcounter++;
      }
    } else if (sleepcounter == 1) {
      System.out.println("**There is a 90% chance you fall asleep**");
      check = Chances.ChanceGuaranteed();
      if (check == 'y') {
        sleepcounter++;
      }
    } else if (sleepcounter == 2) {
      System.out.println("**There is a 75% chance you fall asleep**");
      check = Chances.ChanceLikely();
      if (check == 'y') {
        sleepcounter++;
      }
    } else if (sleepcounter == 3) {
      System.out.println("**There is a 50% chance you fall asleep**");
      check = Chances.ChanceEven();
      if (check == 'y') {
        sleepcounter++;
      }
    } else if (sleepcounter == 4) {
      System.out.println("**There is a 25% chance you fall asleep**");
      check = Chances.ChanceUnlikely();
      if (check == 'y') {
        sleepcounter++;
      }
    } else if (sleepcounter == 5) {
      System.out.println("**There is a 10% chance you fall asleep**");
      check = Chances.ChanceSlim();
      if (check == 'y') {
        sleepcounter++;
      }
    } else if (sleepcounter == 6) {
      System.out.println("**There is a 5% chance you fall asleep**");
      check = Chances.ChanceYeahRight();
      if (check == 'y') {
        sleepcounter++;
      }
    } else if (sleepcounter == 7) {
      System.out.println("**There is a 1% chance you fall asleep**");
      check = Chances.ChanceImpossible();
    }

    if (check == 'y') {
      System.out.println("**You doze off in to a peaceful slumber.**");
      bookshelf = !bookshelf;

      switch (keepToy) {
        case "soldier":
          System.out.println(
              "**You dream of epic battles on far off battlefields.**");
          Attributes.increaseSoldierly(1);
          break;
        case "train":
          System.out.println(
              "**You dream of being the richest man in the world.**");
          Attributes.increaseIndustrious(1);
          break;
        case "top-hat":
          System.out
              .println(
                  "**You dream of being the president of the United States.**");
          Attributes.increasePolitical(1);
          break;
      }
    } else if (check == 'n') {
      System.out.println("**You can't seem to rest your mind enough to sleep.**");
    }
    System.out.println("A: Scan the book shelf\nB: Try to fall asleep\nC: Play with the toy your mom got you");

    Scanner scannerwhatDoInRoom = new Scanner(System.in);
    String whatDoInRoom = scannerwhatDoInRoom.nextLine();

    if (whatDoInRoom.equalsIgnoreCase("A")) {
      bookShelfGrandmaHouse();
    } else if (whatDoInRoom.equalsIgnoreCase("B")) {
      goToBedGrandma();
    } else if (whatDoInRoom.equalsIgnoreCase("C")) {
      toyGrandmaHouse();
    }

  }

  public static void grandmaKitchen() {
    System.out.println("**You entered the kitchen.**");
    System.out.println("ATTENTION PLAYER: KITCHEN HAS NOT BE DEVELOPED YET.");

    System.out.println("A: Walk out the front door\nB: Head up the stairs\nC: Walk to the kitchen");

    Scanner scannerJustInTheHouse = new Scanner(System.in);
    String JustInTheHouse = scannerJustInTheHouse.nextLine();

    if (JustInTheHouse.equalsIgnoreCase("A")) {
      GrandmaHouse();
    } else if (JustInTheHouse.equalsIgnoreCase("B")) {
      grandmaUpStairs();
    } else if (JustInTheHouse.equalsIgnoreCase("C")) {
      grandmaKitchen();
    } else {
      System.out.println("Invalid choice. Please try again.");
      grandmaKitchen(); // Restart the method if the choice is invalid
    }
  }

}