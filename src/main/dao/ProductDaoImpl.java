public class ProductDaoImpl implement ProductDao
{
@Autowired
Datasource ds;

public List<Product> getPID()
{
List productList = new ArrayList();

String sqlQuery = "SELECT * FROM Products"; //Update for security

JdbcTemplate jdbcTemp = new JdbcTemplate(ds);
productList = jdbcTemplate.query(sqlQuery, new ProductRowMapper()); //Custom Row Mapper to be created
return productList;

}

}
