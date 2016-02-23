package servlet;
import domain.Person;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.persistence.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name="opower_infos",
        urlPatterns={"/opower_infos"})
public class OpowerInfos extends HttpServlet {

    private EntityManager manager;
    private EntityManagerFactory factory;

    public OpowerInfos(EntityManager manager, EntityManagerFactory factory){
        this.manager = manager;
        this.factory = factory;
    }

    public void init() {
        this.factory = Persistence.createEntityManagerFactory("mysql");
        this.manager = factory.createEntityManager();

        EntityTransaction tx = manager.getTransaction();
        tx.begin();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

/*        String s1 = "Select * from Person";
        String s2 = "Select * from Home";
        String s3 = "Select * from Device";

        Query q = manager.createQuery(s1, Person.class);
        List<Person> res = q.getResultList();

        manager.close();
        factory.close();

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        out.println("<html>");

        for(Person person: res) {
            out.println("<li>");
            out.println(person.getName());
            out.println("</li>");
        }

        out.println("</html>");*/

        PrintWriter p = new PrintWriter(resp.getOutputStream());
        p.print("Hello world SIR");
        p.flush();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        super.doPost(req, resp);
    }
}
