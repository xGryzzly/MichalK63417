package com.systemzarzadzaniaerphrm.DBconfig;
import com.systemzarzadzaniaerphrm.Entity.Pracownik;

import java.util.List;

public class Pracownikserv implements DBrepo{

    private Pracownikrepo pracrepo;
    public Pracownikserv(Pracownikrepo pracrepo) {
        super();

        this.pracrepo = pracrepo;
    }
    @Override
    public List<Pracownik> getPracownicy(){
        return pracrepo.findAll();
    }
    @Override
       public Pracownik getPracownik(Long, id);{

    }
    @Override
    public Pracownik savePracownik(Pracownik, prac);{

    }
    @Override
    public Pracownik updatePracownik(Pracownik, prac);{

    }
    @Override
    public  void deletePracownikById(Long, id);{

    }

}
