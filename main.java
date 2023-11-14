import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.*;

public class main {
  private static String name;
  static UI ui = new UI();

  public static void main(String[] args)
      throws InterruptedException, UnsupportedAudioFileException, IOException, LineUnavailableException {
    ui.createUI();
    try {
      File initialSongFile = new File("Audio\\AshokanFarewellQuieter.wav");
      AudioInputStream initialSongStream = AudioSystem.getAudioInputStream(initialSongFile);
      Clip initialSongClip = AudioSystem.getClip();
      initialSongClip.open(initialSongStream);

      File secondSongFile = new File("Audio\\ring-ring-de-banjo-quieter.wav");
      AudioInputStream secondSongStream = AudioSystem.getAudioInputStream(secondSongFile);
      Clip secondSongClip = AudioSystem.getClip();
      secondSongClip.open(secondSongStream);

      File thirdSongFile = new File("Audio\\o-susanna-low-vol.wav");
      AudioInputStream thirdSongStream = AudioSystem.getAudioInputStream(thirdSongFile);
      Clip thirdSongClip = AudioSystem.getClip();
      thirdSongClip.open(thirdSongStream);

      File fourthSongFile = new File("Audio\\yankee-doodle-low-vol.wav");
      AudioInputStream fourthSongStream = AudioSystem.getAudioInputStream(fourthSongFile);
      Clip fourthSongClip = AudioSystem.getClip();
      fourthSongClip.open(fourthSongStream);

      // Play the initial song
      initialSongClip.start();
      initialSongClip.addLineListener(event -> {
        if (event.getType() == LineEvent.Type.STOP) {
          // When the initial song finishes playing, play the second song
          secondSongClip.start();
          secondSongClip.addLineListener(event2 -> {
            if (event2.getType() == LineEvent.Type.STOP) {
              // When the second song finishes playing, play the third song
              thirdSongClip.start();
              thirdSongClip.addLineListener(event3 -> {
                if (event3.getType() == LineEvent.Type.STOP) {
                  // When the third song finishes playing, play the fourth song
                  fourthSongClip.start();
                }
              });
            }
          });
        }
      });
    } catch (Exception e) {
      e.printStackTrace();
    }

    System.out.println("Welcome to \"A Life to be Lived: An American Civil War Experience.\"\n");
    Thread.sleep(3000); // Pause for 2 seconds (2000 milliseconds)
    System.out.println(
        "In this interactive game, you will delve into the complexities of the American Civil War era, where a nation found itself torn apart\nby conflicting ideologies and irreconcilable differences. As a participant in this historic period, your choices will shape the lives of\nvarious individuals and influence the outcome of this pivotal moment in American history.\n");
    Thread.sleep(3000); // Pause for 3 seconds (3000 milliseconds)
    System.out.println(
        "prepare to navigate through the challenges of the era, witnessing the struggles, sacrifices, and triumphs of people from different walks of\nlife. You will be faced with difficult decisions that require careful consideration, as you strive to maintain your integrity and navigate the\never-changing landscape of loyalties and beliefs.\n");
    Thread.sleep(3000); // Pause for 4 seconds (4000 milliseconds)
    System.out.println(
        "whether you align with the Union or the Confederacy, or find yourself caught in the midst of conflicting loyalties, your journey will shed\nlight on the multifaceted nature of this conflict and the personal experiences that shaped the destiny of a nation.\n");
    Thread.sleep(3000);
    System.out.println(
        "So, step into the shoes of those who lived during this tumultuous time and discover the impact your choices can have on history.\nWhat name shall we give your character in this extraordinary journey?\n");
    Scanner scanner = new Scanner(System.in);
    name = scanner.nextLine();

    System.out.println("Hello, " + name + "! Nice to meet you.");
    Thread.sleep(2000);
    System.out.println("What time period were you born in?");
    System.out.println("A: 1810-1820");
    System.out.println("B: 1821-1830");
    System.out.println("C: 1831-1840");
    System.out.println("Input A for option A, B for option B, and C for option C");

    Scanner scannertimePeriodChoice = new Scanner(System.in);
    String timePeriodChoice = scannertimePeriodChoice.nextLine();

    if (timePeriodChoice.equalsIgnoreCase("B")) {
      System.out.println("What state are you born in?");

      System.out.println("A: Virginia");
      System.out.println("B: Georgia");
      System.out.println("C: Kentucky");
      System.out.println("D: New York");
      System.out.println("E: Ohio");

      Scanner scannerstateChoice = new Scanner(System.in);
      String stateChoice = scannerstateChoice.nextLine();

      Attributes attributes = new Attributes();

      if (stateChoice.equals("A")) {
        Stonewall stonewall = new Stonewall(attributes); // open an instance of the attributes class for the stonewall
                                                         // playthrough
        stonewall.StonewallPlay(); // Call the method in the Stonewall class
      }

    }

  }

  public static String getName() {
    return name;
  }

}
