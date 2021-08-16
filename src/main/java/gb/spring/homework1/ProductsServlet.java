package gb.spring.homework1;

import gb.spring.homework1.entity.Product;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ProductsServlet", urlPatterns = "/products")
public class ProductsServlet extends GenericServlet {

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        List<Product> products = initProducts();
        servletResponse.getWriter().write(products.toString());
    }

    private List<Product> initProducts() {
        List<Product> products= new ArrayList<>();
        for (int i = 1; i<=10; i++){
            products.add(new Product(i, "", (int) (Math.random()*100)));
        }
        return products;
    }


}
