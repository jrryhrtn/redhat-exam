import org.junit.Test;

import com.rhexam.q6.customer.domain.*;
import com.rhexam.q6.customer.domain.SearchField;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class RHQ6Test {

    @Test
    public void testCustomerAddress() {
        Address address = new Address("3105", "Carriage Drive", "Hamel", "MN", "55447");
        assertTrue("test street1", address.getStreet1().equals("3105"));
        assertTrue("test street2", address.getStreet2().equals("Carriage Drive"));
        assertTrue("test city", address.getCity().equals("Hamel"));
        assertTrue("test state", address.getState().equals("MN"));
        assertTrue("test zip", address.getZip().equals("55447"));
    }

    @Test
    public void testCustomer() {
        Address address = new Address("3105", "Carriage Drive", "Hamel", "MN", "55447");
        Address address2 = new Address("1111", "Carriage Drive", "xyz", "MN", "55442");
        Customer customer = new Customer("firstName", "lastName", address);
        assertTrue("test firstName", customer.getFirstName().equals("firstName"));
        assertTrue("test lastName", customer.getLastName().equals("lastName"));
        assertTrue("test address", customer.getAddresses().get(0).equals(address));
        customer.addAddress(address2);
        assertTrue("test add address", customer.getAddresses().size() == 2);
        customer.getAddresses().remove(address);
        assertTrue("test remove address", customer.getAddresses().size() == 1);
    }


    @Test
    public void testCustomerSearchCriteria() {
        CustomerSearchCriteria searchCriteria = new CustomerSearchCriteria(100);
        assertTrue("test recordcount max", searchCriteria.getMaxResultSetSize() == 100);
        assertTrue("test searchfields init", searchCriteria.getFields().size() == 0);
        List<SearchField> fields = new ArrayList<SearchField>();
        SearchField field = new SearchField(SearchField.FieldType.CITY, "hamel");
        fields.add(field);
        searchCriteria.setFields(fields);
        assertTrue("test searchfields init", searchCriteria.getFields().size() == 1);
        assertTrue("test searchfield", searchCriteria.getFields().get(0).equals(field));
    }

}
