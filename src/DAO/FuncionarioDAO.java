package DAO;

import Model.Funcionario;
import java.util.*;

public class FuncionarioDAO {

    public static ArrayList<Funcionario> MinhaLista = new ArrayList<Funcionario>();

    public static int maiorID() {
        
        int maiorID = 0;
        for (int i = 0; i < MinhaLista.size(); i++) {
            if (MinhaLista.get(i).getId() > maiorID) {
                maiorID = MinhaLista.get(i).getId();
            }
        }
        return maiorID;
    }

}
