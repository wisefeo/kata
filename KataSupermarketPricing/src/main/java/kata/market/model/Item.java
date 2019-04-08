package kata.market.model;

import io.vavr.Tuple;
import io.vavr.Tuple2;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Item {
    private boolean byWeight;
    private Tuple2<Integer, Float> reductionValueByNumber = Tuple.of(null, null);
    private String name;
    private int unitaryPrice;
    
	public Item(boolean byWeight, Tuple2<Integer, Float> reductionValueByNumber, String name, int unitaryPrice) {
		super();
		this.byWeight = byWeight;
		this.reductionValueByNumber = reductionValueByNumber;
		this.name = name;
		this.unitaryPrice = unitaryPrice;
	}

	public boolean isByWeight() {
		return byWeight;
	}

	public void setByWeight(boolean byWeight) {
		this.byWeight = byWeight;
	}

	public Tuple2<Integer, Float> getReductionValueByNumber() {
		return reductionValueByNumber;
	}

	public void setReductionValueByNumber(Tuple2<Integer, Float> reductionValueByNumber) {
		this.reductionValueByNumber = reductionValueByNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getUnitaryPrice() {
		return unitaryPrice;
	}

	public void setUnitaryPrice(int unitaryPrice) {
		this.unitaryPrice = unitaryPrice;
	}
	
	
    
    
}
