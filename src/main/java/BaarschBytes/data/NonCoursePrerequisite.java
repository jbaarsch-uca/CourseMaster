package BaarschBytes.data;

import java.util.HashMap;
import java.util.Map;

public enum NonCoursePrerequisite implements Prerequisite {

    junior, senior, thirtyCredits, sixtyCredits, instructorConsent,cOrBetter;


    public Map<String, String> getAttributes() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("Non Course Prerequisite", this.toString());
        return map;
    }
}
