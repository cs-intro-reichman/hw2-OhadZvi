public class TimeCalc {
    public static void main(String[] args) {
        String[] inpTime = args[0].split(":");
        int inpHours = Integer.parseInt(inpTime[0]);
        int inpMinutes = Integer.parseInt(inpTime[1]);
        int minutesToAdd = Integer.parseInt(args[1]);
        int totMinutes = inpHours * 60 + inpMinutes + minutesToAdd;
        int totHours = totMinutes / 60;
        int newHours = totHours % 24;
        int newMinutes = totMinutes - (totHours * 60);
        String sNewHours  = "" + newHours;
        String sNewMinutes = "" + newMinutes;
        if (newHours < 10) {
            sNewHours = "0" + newHours;
        }
        if (newMinutes < 10) {
            sNewMinutes = "0" + newMinutes;
        }
        System.out.println(sNewHours + ":" + sNewMinutes);
    }
}
