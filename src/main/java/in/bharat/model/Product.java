package in.bharat.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Bharat patel
 */
@Entity
public class Product implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer prodId;
	private String prodCode;
	private Double prodCost;

	private Double prodDiscount;
	private Double prodGst;

  public String getProdCode() {
    return prodCode;
  }

  public void setProdCode(String prodCode) {
    this.prodCode = prodCode;
  }

  public Double getProdCost() {
    return prodCost;
  }

  public void setProdCost(Double prodCost) {
    this.prodCost = prodCost;
  }

  public Integer getProdId() {
    return prodId;
  }

  public void setProdId(Integer prodId) {
    this.prodId = prodId;
  }

  public Double getProdDiscount() {
    return prodDiscount;
  }

  public void setProdDiscount(Double prodDiscount) {
    this.prodDiscount = prodDiscount;
  }

  public Double getProdGst() {
    return prodGst;
  }

  public void setProdGst(Double prodGst) {
    this.prodGst = prodGst;
  }
}
