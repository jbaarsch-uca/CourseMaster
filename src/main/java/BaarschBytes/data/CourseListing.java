package BaarschBytes.data;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Arrays;
import java.util.UUID;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CourseListing {

    public enum ScheduleType {Lecture, Internship, Laboratory, Special_Topics, LectureLaboratory}

    public CourseListing() {
    }

    /*
        //private Course course;
        private UUID id;
        private int section;
        private int hours;
        private int CRN;
        private Term term;
        private int year;
        private Instructor instructor;
        private CourseTime[] courseTimes;
        private int seatsAvailable;
        private int seatsTaken;
        private ScheduleType scheduleType;
        private String[] attributes;
    */
    private String id; // 205380,
    private String term; // "202620",
    private String termDesc; // "Spring 2026",
    private String courseReferenceNumber; // "22181",
    private String partOfTerm; // "1",
    private String courseNumber; // "1470",
    private String courseDisplay; // "1470",
    private String subject; // "CSCI",
    private String subjectDescription; // "Computer Science",
    private Integer sequenceNumber; // "0",
    private String campusDescription; // "Main",
    private String scheduleTypeDescription; // "Lecture",
    private String courseTitle; // "COMPUTER SCIENCE I",
    private Integer creditHours; // 4,
    private Integer maximumEnrollment; // 20,
    private Integer enrollment; // 0,
    private Integer seatsAvailable; // 20,
    private Integer waitCapacity; // 0,
    private Integer waitCount; //  0,
    private Integer waitAvailable; // 0,
    private Boolean crossList; //null,
    private Integer crossListCapacity; // null,
    private Integer crossListCount; // null,
    private Boolean crossListAvailable; // null,
    private Integer creditHourHigh; // null,
    private int creditHourLow; // 4,
    private String creditHourIndicator; // null,
    private boolean openSection; // true,
    private String linkIdentifier; // null,
    private Boolean isSectionLinked; // false,
    private String subjectCourse;// "CSCI1470",

    private Instructor[] faculty;
    private Object[] meetingsFaculty;
    private String reservedSeatSummary;
    private SectionAttribute[] sectionAttributes;
    private String instructionalMethod;
    private String instructionalMethodDescription;

    public Boolean getSectionLinked() {
        return isSectionLinked;
    }

    public String getInstructionalMethodDescription() {
        return instructionalMethodDescription;
    }

    public void setInstructionalMethodDescription(String instructionalMethodDescription) {
        this.instructionalMethodDescription = instructionalMethodDescription;
    }

    public Instructor[] getFaculty() {
        return faculty;
    }

    public void setFaculty(Instructor[] faculty) {
        this.faculty = faculty;
    }

    public Object[] getMeetingsFaculty() {
        return meetingsFaculty;
    }

    public void setMeetingsFaculty(Object[] meetingsFaculty) {
        this.meetingsFaculty = meetingsFaculty;
    }

    public String getReservedSeatSummary() {
        return reservedSeatSummary;
    }

    public void setReservedSeatSummary(String reservedSeatSummary) {
        this.reservedSeatSummary = reservedSeatSummary;
    }

    public SectionAttribute[] getSectionAttributes() {
        return sectionAttributes;
    }

    public void setSectionAttributes(SectionAttribute[] sectionAttributes) {
        this.sectionAttributes = sectionAttributes;
    }

    public String getInstructionalMethod() {
        return instructionalMethod;
    }

    public void setInstructionalMethod(String instructionalMethod) {
        this.instructionalMethod = instructionalMethod;
    }

    @Override
    public String toString() {
        return "CourseListing{" +
                "id='" + id + '\'' +
                ", term='" + term + '\'' +
                ", termDesc='" + termDesc + '\'' +
                ", courseReferenceNumber='" + courseReferenceNumber + '\'' +
                ", partOfTerm='" + partOfTerm + '\'' +
                ", courseNumber='" + courseNumber + '\'' +
                ", courseDisplay='" + courseDisplay + '\'' +
                ", subject='" + subject + '\'' +
                ", subjectDescription='" + subjectDescription + '\'' +
                ", sequenceNumber=" + sequenceNumber +
                ", campusDescription='" + campusDescription + '\'' +
                ", scheduleTypeDescription=" + scheduleTypeDescription +
                ", courseTitle='" + courseTitle + '\'' +
                ", creditHours=" + creditHours +
                ", maximumEnrollment=" + maximumEnrollment +
                ", enrollment=" + enrollment +
                ", seatsAvailable=" + seatsAvailable +
                ", waitCapacity=" + waitCapacity +
                ", waitCount=" + waitCount +
                ", waitAvailable=" + waitAvailable +
                ", crossList=" + crossList +
                ", crossListCapacity=" + crossListCapacity +
                ", crossListCount=" + crossListCount +
                ", crossListAvailable=" + crossListAvailable +
                ", creditHourHigh=" + creditHourHigh +
                ", creditHourLow=" + creditHourLow +
                ", creditHourIndicator='" + creditHourIndicator + '\'' +
                ", openSection=" + openSection +
                ", linkIdentifier='" + linkIdentifier + '\'' +
                ", isSectionLinked=" + isSectionLinked +
                ", subjectCourse='" + subjectCourse + '\'' +
                ", faculty=" + Arrays.toString(faculty) +
                ", meetingsFaculty=" + Arrays.toString(meetingsFaculty) +
                ", reservedSeatSummary='" + reservedSeatSummary + '\'' +
                ", sectionAttributes=" + Arrays.toString(sectionAttributes) +
                ", instructionalMethod='" + instructionalMethod + '\'' +
                ", instructionalMethodDescription='" + instructionalMethodDescription + '\'' +
                '}';
    }

    public CourseListing(String id, String term, String termDesc, String courseReferenceNumber, String partOfTerm, String courseNumber, String courseDisplay, String subject, String subjectDescription, Integer sequenceNumber, String campusDescription, String scheduleTypeDescription, String courseTitle, Integer creditHours, Integer maximumEnrollment, Integer enrollment, Integer seatsAvailable, Integer waitCapacity, Integer waitCount, Integer waitAvailable, Boolean crossList, Integer crossListCapacity, Integer crossListCount, Boolean crossListAvailable, Integer creditHourHigh, int creditHourLow, String creditHourIndicator, boolean openSection, String linkIdentifier, Boolean isSectionLinked, String subjectCourse, Instructor[] faculty, Object[] meetingsFaculty, String reservedSeatSummary, SectionAttribute[] sectionAttributes, String instructionalMethod, String instructionalMethodDescription) {
        this.id = id;
        this.term = term;
        this.termDesc = termDesc;
        this.courseReferenceNumber = courseReferenceNumber;
        this.partOfTerm = partOfTerm;
        this.courseNumber = courseNumber;
        this.courseDisplay = courseDisplay;
        this.subject = subject;
        this.subjectDescription = subjectDescription;
        this.sequenceNumber = sequenceNumber;
        this.campusDescription = campusDescription;
        this.scheduleTypeDescription = scheduleTypeDescription;
        this.courseTitle = courseTitle;
        this.creditHours = creditHours;
        this.maximumEnrollment = maximumEnrollment;
        this.enrollment = enrollment;
        this.seatsAvailable = seatsAvailable;
        this.waitCapacity = waitCapacity;
        this.waitCount = waitCount;
        this.waitAvailable = waitAvailable;
        this.crossList = crossList;
        this.crossListCapacity = crossListCapacity;
        this.crossListCount = crossListCount;
        this.crossListAvailable = crossListAvailable;
        this.creditHourHigh = creditHourHigh;
        this.creditHourLow = creditHourLow;
        this.creditHourIndicator = creditHourIndicator;
        this.openSection = openSection;
        this.linkIdentifier = linkIdentifier;
        this.isSectionLinked = isSectionLinked;
        this.subjectCourse = subjectCourse;
        this.faculty = faculty;
        this.meetingsFaculty = meetingsFaculty;
        this.reservedSeatSummary = reservedSeatSummary;
        this.sectionAttributes = sectionAttributes;
        this.instructionalMethod = instructionalMethod;
        this.instructionalMethodDescription = instructionalMethodDescription;
    }

    public String getSubjectCourse() {
        return subjectCourse;
    }

    public void setSubjectCourse(String subjectCourse) {
        this.subjectCourse = subjectCourse;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public String getTermDesc() {
        return termDesc;
    }

    public void setTermDesc(String termDesc) {
        this.termDesc = termDesc;
    }

    public String getCourseReferenceNumber() {
        return courseReferenceNumber;
    }

    public void setCourseReferenceNumber(String courseReferenceNumber) {
        this.courseReferenceNumber = courseReferenceNumber;
    }

    public String getPartOfTerm() {
        return partOfTerm;
    }

    public void setPartOfTerm(String partOfTerm) {
        this.partOfTerm = partOfTerm;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public String getCourseDisplay() {
        return courseDisplay;
    }

    public void setCourseDisplay(String courseDisplay) {
        this.courseDisplay = courseDisplay;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSubjectDescription() {
        return subjectDescription;
    }

    public void setSubjectDescription(String subjectDescription) {
        this.subjectDescription = subjectDescription;
    }

    public Integer getSequenceNumber() {
        return sequenceNumber;
    }

    public void setSequenceNumber(Integer sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    public String getCampusDescription() {
        return campusDescription;
    }

    public void setCampusDescription(String campusDescription) {
        this.campusDescription = campusDescription;
    }

    public String getScheduleTypeDescription() {
        return scheduleTypeDescription;
    }

    public void setScheduleTypeDescription(String scheduleTypeDescription) {
        this.scheduleTypeDescription = scheduleTypeDescription;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public Integer getCreditHours() {
        return creditHours;
    }

    public void setCreditHours(Integer creditHours) {
        this.creditHours = creditHours;
    }

    public Integer getMaximumEnrollment() {
        return maximumEnrollment;
    }

    public void setMaximumEnrollment(Integer maximumEnrollment) {
        this.maximumEnrollment = maximumEnrollment;
    }

    public Integer getEnrollment() {
        return enrollment;
    }

    public void setEnrollment(Integer enrollment) {
        this.enrollment = enrollment;
    }

    public Integer getSeatsAvailable() {
        return seatsAvailable;
    }

    public void setSeatsAvailable(Integer seatsAvailable) {
        this.seatsAvailable = seatsAvailable;
    }

    public Integer getWaitCapacity() {
        return waitCapacity;
    }

    public void setWaitCapacity(Integer waitCapacity) {
        this.waitCapacity = waitCapacity;
    }

    public Integer getWaitCount() {
        return waitCount;
    }

    public void setWaitCount(Integer waitCount) {
        this.waitCount = waitCount;
    }

    public Integer getWaitAvailable() {
        return waitAvailable;
    }

    public void setWaitAvailable(Integer waitAvailable) {
        this.waitAvailable = waitAvailable;
    }

    public Boolean getCrossList() {
        return crossList;
    }

    public void setCrossList(Boolean crossList) {
        this.crossList = crossList;
    }

    public Integer getCrossListCapacity() {
        return crossListCapacity;
    }

    public void setCrossListCapacity(Integer crossListCapacity) {
        this.crossListCapacity = crossListCapacity;
    }

    public Integer getCrossListCount() {
        return crossListCount;
    }

    public void setCrossListCount(Integer crossListCount) {
        this.crossListCount = crossListCount;
    }

    public Boolean getCrossListAvailable() {
        return crossListAvailable;
    }

    public void setCrossListAvailable(Boolean crossListAvailable) {
        this.crossListAvailable = crossListAvailable;
    }

    public Integer getCreditHourHigh() {
        return creditHourHigh;
    }

    public void setCreditHourHigh(Integer creditHourHigh) {
        this.creditHourHigh = creditHourHigh;
    }

    public int getCreditHourLow() {
        return creditHourLow;
    }

    public void setCreditHourLow(int creditHourLow) {
        this.creditHourLow = creditHourLow;
    }

    public String getCreditHourIndicator() {
        return creditHourIndicator;
    }

    public void setCreditHourIndicator(String creditHourIndicator) {
        this.creditHourIndicator = creditHourIndicator;
    }

    public boolean isOpenSection() {
        return openSection;
    }

    public void setOpenSection(boolean openSection) {
        this.openSection = openSection;
    }

    public String getLinkIdentifier() {
        return linkIdentifier;
    }

    public void setLinkIdentifier(String linkIdentifier) {
        this.linkIdentifier = linkIdentifier;
    }

    public Boolean isSectionLinked() {
        return isSectionLinked;
    }

    public void setSectionLinked(Boolean isSectionLinked) {
        this.isSectionLinked = isSectionLinked;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
//privatefaculty":




}
