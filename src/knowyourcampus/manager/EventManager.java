package knowyourcampus.manager;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import knowyourcampus.model.Event;
import knowyourcampus.model.EventCategory;

public class EventManager {

   final  private List<Event> events = new ArrayList<>();

    private boolean isDuplicateEventCode(String eventCode) {

        for (Event event : events) {
            if (Objects.equals(event.getEventCode(), eventCode))
                return true;
        }

        return false;
    }

    public boolean addEvent(Event event) {

        if (event == null || event.getEventCode() == null)
            return false;

        if (isDuplicateEventCode(event.getEventCode()))
            return false;

        events.add(event);
        return true;
    }

    public Event findEventByCode(String eventCode) {

        for (Event event : events) {

            if (Objects.equals(event.getEventCode(), eventCode))
                return event;

        }

        return null;
    }

    public List<Event> getAllEvents() {
        return events;
    }

    public boolean updateEvent(Event updatedEvent) {

        if (updatedEvent == null || updatedEvent.getEventCode() == null)
            return false;

        Event event = findEventByCode(updatedEvent.getEventCode());

        if (event == null)
            return false;

        event.setTitle(updatedEvent.getTitle());
        event.setCategory(updatedEvent.getCategory());
        event.setDescription(updatedEvent.getDescription());
        event.setVenue(updatedEvent.getVenue());
        event.setTime(updatedEvent.getTime());
        event.setLastUpdated(updatedEvent.getLastUpdated());
        event.setVerified(updatedEvent.isVerified());

        return true;
    }

    public boolean deleteEvent(String eventCode) {

        Event event = findEventByCode(eventCode);

        if (event == null)
            return false;

        events.remove(event);

        return true;
    }

    public List<Event> findEventsByTitle(String keyword) {

        List<Event> result = new ArrayList<>();

        if (keyword == null)
            return result;

        for (Event event : events) {

            if (event.getTitle() != null && event.getTitle().contains(keyword))
                result.add(event);

        }

        return result;
    }

    public List<Event> findEventsByCategory(EventCategory category) {

        List<Event> result = new ArrayList<>();

        for (Event event : events) {

            if (event.getCategory() == category)
                result.add(event);

        }

        return result;
    }

    public List<Event> findEventsByVenue(String venue) {

        List<Event> result = new ArrayList<>();

        if (venue == null)
            return result;

        for (Event event : events) {

            if (event.getVenue() != null && event.getVenue().contains(venue))
                result.add(event);

        }

        return result;
    }

    public boolean isEventExists(String eventCode) {
        return findEventByCode(eventCode) != null;
    }

    public int getTotalEvents() {
        return events.size();
    }

    public int countEventsByCategory(EventCategory category) {

        int count = 0;

        for (Event event : events) {

            if (event.getCategory() == category)
                count++;

        }

        return count;
    }

    public void clearAllEvents() {
        events.clear();
    }
}