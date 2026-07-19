package knowyourcampus.model;

public class Event {

    private String title;
    private EventCategory category;
    private String description;
    private String venue;
    private String time;
    private final String eventCode;
    private String lastUpdated;
    private boolean verified;

    public Event(String title,
                 EventCategory category,
                 String description,
                 String venue,
                 String time,
                 String eventCode,
                 String lastUpdated,
                 boolean verified) {

        this.title = title;
        this.category = category;
        this.description = description;
        this.venue = venue;
        this.time = time;
        this.eventCode = eventCode;
        this.lastUpdated = lastUpdated;
        this.verified = verified;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public EventCategory getCategory() {
        return category;
    }

    public void setCategory(EventCategory category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getEventCode() {
        return eventCode;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public boolean isVerified() {
        return verified;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }

    @Override
    public String toString() {
        return "Event{" +
                "title='" + title + '\'' +
                ", category=" + category +
                ", venue='" + venue + '\'' +
                ", time='" + time + '\'' +
                ", eventCode='" + eventCode + '\'' +
                '}';
    }
}