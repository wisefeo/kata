package kata.market.model;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class CustomerTest {
    private Item aSweep, aPotato;
    private Customer aCustomer;

    @Test
    public void shouldAddToCartWhenAdded() {
        //given
        aCustomer = new Customer();
        aSweep = new Item(false, null, "sweep", 50);
        aPotato = new Item(true, null, "potato", 5);

        //when
        aCustomer.addToCart(aSweep, 1f);
        aCustomer.addToCart(aPotato, 1.2f);

        //then
        assertThat(aCustomer.getCart().toString(), is("{" + aSweep.toString() + "=1.0, " + aPotato.toString() + "=1.2}"));
    }

    @Test
    public void shouldUpdateValueInCartWhenAddedTwice() {
        //given
        aCustomer = new Customer();
        aSweep = new Item(false, null, "sweep", 50);
        aPotato = new Item(true, null, "potato", 5);

        //when
        aCustomer.addToCart(aSweep, 1f);
        aCustomer.addToCart(aPotato, 1.2f);
        aCustomer.addToCart(aSweep, 1f);

        //then
        assertThat(aCustomer.getCart().toString(), is("{" + aSweep.toString() + "=2.0, " + aPotato.toString() + "=1.2}"));
    }

    @Test
    public void shouldRemoveFromCartWhenRemoved() {
        //given
        aCustomer = new Customer();
        aSweep = new Item(false, null, "sweep", 50);
        aPotato = new Item(true, null, "potato", 5);
        aCustomer.addToCart(aPotato, 1.7f);
        aCustomer.addToCart(aSweep, 2.0f);

        //when
        aCustomer.removeFromCart(aSweep, 2.0f);
        aCustomer.removeFromCart(aPotato, 1.2f);

        //then
        assertThat(aCustomer.getCart().toString(), is("{" + aPotato.toString() + "=0.5}"));
    }
}
