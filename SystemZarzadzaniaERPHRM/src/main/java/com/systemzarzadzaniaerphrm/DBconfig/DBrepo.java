package com.systemzarzadzaniaerphrm.DBconfig;

import com.systemzarzadzaniaerphrm.Entity.Pracownik;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DBrepo extends JpaRepository<Pracownik, Long> {

    List<Pracownik> getPracownicy();

        Pracownik getPracownik(Long, id);
        Pracownik savePracownik(Pracownik, prac);
        Pracownik updatePracownik(Pracownik, prac);
        void deletePracownikById(Long, id);

}

