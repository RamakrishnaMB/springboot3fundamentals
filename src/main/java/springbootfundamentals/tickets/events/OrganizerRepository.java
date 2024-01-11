package springbootfundamentals.tickets.events;

//import org.springframework.stereotype.Repository;

import java.util.List;
// used for in-memory
//@Repository
//public class OrganizerRepository {
//    private final List<Organizer> organizers = List.of(
//            new Organizer(101, "Globomantics", "Globomantics Technology Corporation"),
//            new Organizer(102, "Carved Rock", "Carved Rock Sports Equipment"));
//
//    public List<Organizer> findAll() {
//        return organizers;
//    }
//}

// for JPA using postgress sql

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrganizerRepository extends JpaRepository<Organizer, Integer> {
}
