package Web;

import dao.DaoImpl;
import metier.MetierImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by X-MART on 18/03/2017.
 */
@WebServlet(name = "ControleurServlet" , urlPatterns={"*.php"})
public class ControleurServlet extends HttpServlet {
    private MetierImpl metier;
    @Override

    public void init() throws ServletException {
        metier=new MetierImpl();

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        DaoImpl dao = new DaoImpl();
        metier= new MetierImpl();
        metier.setDao(dao);
        Modele modele=new Modele();
        modele.setCalcul(metier.calcul());
        modele.setList(metier.getData());
        request.setAttribute("modele",modele);
        request.getRequestDispatcher("index.jsp").forward(request,response);
    }
}
