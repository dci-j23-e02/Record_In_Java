package recaping;

public enum Day {
  MONDAY(1),
  TUESDAY(2),
  WEDNESDAY(3),
  THURSDAY(4),
  FRIDAY(5),
  SATURDAY(6),
  SUNDAY(7);

  private int value;
  public static final Day DEFAULT_DAY = MONDAY;


  private  Day(int value){
    this.value = value;
  }

  public int getValue(){
    return value;
  }


  public boolean isWeekEnd(){
    if(value == 6 || value == 7 ){
      return true;
    }

    return false;
  }
}
