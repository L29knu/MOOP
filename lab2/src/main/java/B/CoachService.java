package B;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public final class CoachService {


    private CoachService() {
    }

    public static List<Coach> findCoachesByPassengerAmount(int min, int max, List<Coach> coaches) {
        List<Coach> res = new ArrayList<Coach>();
        for (Coach c : coaches) {
            if (c.getPassangerAmount() >= min && c.getPassangerAmount() <= max) {
                res.add(c);
            }
        }
        return res;
    }

    public static int totalAmount(List<Coach> coaches) {
        int sum = 0;
        for (Coach coach : coaches) {
            sum += (coach.getBaggageAmount() + coach.getPassangerAmount());
        }
        return sum;
    }

    public void sortByComfort(List<Coach> coaches) {
        coaches.sort(new Comparator<Coach>() {
            @Override
            public int compare(Coach c1, Coach c2) {
                return c1.getComfortLevel().compareTo(c2.getComfortLevel());
            }
        });
    }
}
