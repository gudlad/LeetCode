class Solution {
    public boolean haveConflict(String[] event1, String[] event2) {
    String endTime1 = event1[1];
    String startTime1=event1[0];
    String startTime2 = event2[0];
    String endTime2=event2[1];

    int endHour1 = Integer.parseInt(endTime1.substring(0, 2));
    int endMinute1 = Integer.parseInt(endTime1.substring(3));
    int startHour1 = Integer.parseInt(startTime1.substring(0, 2));
    int startMinute1 = Integer.parseInt(startTime1.substring(3));
    int startHour2 = Integer.parseInt(startTime2.substring(0, 2));
    int startMinute2 = Integer.parseInt(startTime2.substring(3));
    int endHour2 = Integer.parseInt(endTime2.substring(0, 2));
    int endMinute2= Integer.parseInt(endTime2.substring(3));

    int endTotal1 = endHour1 * 60 + endMinute1;
    int startTotal1=startHour1*60+ startMinute1;
    int startTotal2 = startHour2 * 60 + startMinute2;
    int endTotal2=endHour2*60+endMinute2;

    if((startTotal2 >= startTotal1 && startTotal2<=endTotal1) || (startTotal1 >=startTotal2 && startTotal1 <= endTotal2))
        return true;
    else
        return false;
    //  return event1[0].compareTo(event2[1]) <= 0 && event2[0].compareTo(event1[1]) <= 0;
}

}


// The logic is comparing the start time of event1 with the end time of event2, as well as the start time of event2 with the end time of event1. This comparison is performed to check for any potential overlap between the time intervals of the two events.

// Let's analyze it with an example:

// String[] event1 = {"10:00", "11:00"};
// String[] event2 = {"11:30", "12:30"};

// event1[0].compareTo(event2[1]) <= 0:
// Comparing "10:00" with "12:30".
// "10:00" is less than "12:30".
// The condition event1[0].compareTo(event2[1]) <= 0 evaluates to true.

// event2[0].compareTo(event1[1]) <= 0:
// Comparing "11:30" with "11:00".
// "11:30" is greater than "11:00".
// The condition event2[0].compareTo(event1[1]) <= 0 evaluates to false.
// Combining the results with the logical AND operator (&&):

// true && false evaluates to false.
// In this example, the overall result is false, indicating that there is no conflict between event1 and event2. The time interval of event1 does not overlap with the time interval of event2.