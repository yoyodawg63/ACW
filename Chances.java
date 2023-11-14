import java.util.Random;

public class Chances {

  public static char ChanceImpossible() {
    Random random = new Random();
    int chance = random.nextInt(101);
    char result = '?';
    if (chance > 99) {
      result = 'y';
    } else {
      result = 'n';
    }
    return result;
  }

  public static char ChanceYeahRight() {
    Random random = new Random();
    int chance = random.nextInt(101);
    char result = '?';
    if (chance > 95) {
      result = 'y';
    } else {
      result = 'n';
    }
    return result;
  }

  public static char ChanceSlim() {
    Random random = new Random();
    int chance = random.nextInt(101);
    char result = '?';
    if (chance > 90) {
      result = 'y';
    } else {
      result = 'n';
    }
    return result;
  }

  public static char ChanceUnlikely() {
    Random random = new Random();
    int chance = random.nextInt(101);
    char result = '?';
    if (chance > 75) {
      result = 'y';
    } else {
      result = 'n';
    }
    return result;
  }

  public static char ChanceEven() {
    Random random = new Random();
    int chance = random.nextInt(101);
    char result = '?';
    if (chance > 50) {
      result = 'y';
    } else {
      result = 'n';
    }
    return result;
  }

  public static char ChanceLikely() {
    Random random = new Random();
    int chance = random.nextInt(101);
    char result = '?';
    if (chance > 25) {
      result = 'y';
    } else {
      result = 'n';
    }
    return result;
  }

  public static char ChanceGuaranteed() {
    Random random = new Random();
    int chance = random.nextInt(101);
    char result = '?';
    if (chance > 10) {
      result = 'y';
    } else {
      result = 'n';
    }
    return result;
  }

}
