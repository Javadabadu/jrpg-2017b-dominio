package dominio;

import java.util.ArrayList;
import java.util.List;

/**
 * Mochila del jugador
 */
public class Mochila {
	private static final int CANTITEMS = 20;
	private static final int ITEM1 = 1, ITEM2 = 2, ITEM3 = 3, ITEM4 = 4, ITEM5 = 5, ITEM6 = 6, ITEM7 = 7, ITEM8 = 8,
			ITEM9 = 9, ITEM10 = 10;
	private static final int ITEM11 = 11, ITEM12 = 12, ITEM13 = 13, ITEM14 = 14, ITEM15 = 15, ITEM16 = 16, ITEM17 = 17,
			ITEM18 = 18, ITEM19 = 19, ITEM20 = 20;
	private int idMochila;
	private int item1;
	private int item2;
	private int item3;
	private int item4;
	private int item5;
	private int item6;
	private int item7;
	private int item8;
	private int item9;
	private int item10;
	private int item11;
	private int item12;
	private int item13;
	private int item14;
	private int item15;
	private int item16;
	private int item17;
	private int item18;
	private int item19;
	private int item20;
	private ArrayList<Integer> items = new ArrayList<Integer>();

	/**
	 * Construye la mochila
	 *
	 * @param idMochila
	 *            id
	 * @param item1
	 *            1
	 * @param item2
	 *            2
	 * @param item3
	 *            3
	 * @param item4
	 *            4
	 * @param item5
	 *            5
	 * @param item6
	 *            6
	 * @param item7
	 *            7
	 * @param item8
	 *            8
	 * @param item9
	 *            9
	 * @param item10
	 *            10
	 * @param item11
	 *            11
	 * @param item12
	 *            12
	 * @param item13
	 *            13
	 * @param item14
	 *            14
	 * @param item15
	 *            15
	 * @param item16
	 *            16
	 * @param item17
	 *            17
	 * @param item18
	 *            18
	 * @param item19
	 *            19
	 * @param item20
	 *            20
	 */
	public Mochila(final int idMochila, final int item1, final int item2, final int item3, final int item4,
			final int item5, final int item6, final int item7, final int item8, final int item9, final int item10,
			final int item11, final int item12, final int item13, final int item14, final int item15, final int item16,
			final int item17, final int item18, final int item19, final int item20) {
		this.idMochila = idMochila;
		this.item1 = item1;
		this.item2 = item2;
		this.item3 = item3;
		this.item4 = item4;
		this.item5 = item5;
		this.item6 = item6;
		this.item7 = item7;
		this.item8 = item8;
		this.item9 = item9;
		this.item10 = item10;
		this.item11 = item11;
		this.item12 = item12;
		this.item13 = item13;
		this.item14 = item14;
		this.item15 = item15;
		this.item16 = item16;
		this.item17 = item17;
		this.item18 = item18;
		this.item19 = item19;
		this.item20 = item20;

	}

	/**
	 * 
	 * @param idMochila
	 */
	public Mochila(final int idMochila) {
		this.idMochila = idMochila;
		item1 = -1;
		item2 = -1;
		item3 = -1;
		item4 = -1;
		item5 = -1;
		item6 = -1;
		item7 = -1;
		item8 = -1;
		item9 = -1;
		item10 = -1;
		item11 = -1;
		item12 = -1;
		item13 = -1;
		item14 = -1;
		item15 = -1;
		item16 = -1;
		item17 = -1;
		item18 = -1;
		item19 = -1;
		item20 = -1;

	}

	/**
	 * Constructor por defecto
	 */

	public Mochila() {
		this(0);
	}
 /**
  * Obtener un item oir su id
  * @param i
  * @return
  */
	public int obtenerItem(final int i) {
		int retorno = 0;
		switch (i) {
		case ITEM1:
			retorno = getItem1();
			break;
		case ITEM2:
			retorno = getItem2();
			break;
		case ITEM3:
			retorno = getItem3();
			break;
		case ITEM4:
			retorno = getItem4();
			break;
		case ITEM5:
			retorno = getItem5();
			break;
		case ITEM6:
			retorno = getItem6();
			break;
		case ITEM7:
			retorno = getItem7();
			break;
		case ITEM8:
			retorno = getItem8();
			break;
		case ITEM9:
			retorno = getItem9();
			break;
		case ITEM10:
			retorno = getItem10();
			break;
		case ITEM11:
			retorno = getItem11();
			break;
		case ITEM12:
			retorno = getItem12();
			break;
		case ITEM13:
			retorno = getItem13();
			break;
		case ITEM14:
			retorno = getItem14();
			break;
		case ITEM15:
			retorno = getItem15();
			break;
		case ITEM16:
			retorno = getItem16();
			break;
		case ITEM17:
			retorno = getItem17();
			break;
		case ITEM18:
			retorno = getItem18();
			break;
		case ITEM19:
			retorno = getItem19();
		case ITEM20:
			retorno = getItem20();
		
		}
return retorno;
		
	}
	/**
	 * Establecer valor a item por su id
	 * @param i
	 * @param valorItem
	 */
	public void establecerItem(final int i, final int valorItem) {
		
		switch (i) {
		case ITEM1:
			setItem1(valorItem);
			break;
		case ITEM2:
			setItem2(valorItem);
			break;
		case ITEM3:
			setItem3(valorItem);
			break;
		case ITEM4:
			setItem4(valorItem);
			break;
		case ITEM5:
			setItem5(valorItem);
			break;
		case ITEM6:
			setItem6(valorItem);
			break;
		case ITEM7:
			setItem7(valorItem);
			break;
		case ITEM8:
			setItem8(valorItem);
			break;
		case ITEM9:
			setItem9(valorItem);
			break;
		case ITEM10:
			setItem10(valorItem);
			break;
		case ITEM11:
			setItem11(valorItem);
			break;
		case ITEM12:
			setItem12(valorItem);
			break;
		case ITEM13:
			setItem13(valorItem);
			break;
		case ITEM14:
			setItem4(valorItem);
			break;
		case ITEM15:
			setItem15(valorItem);
			break;
		case ITEM16:
			setItem16(valorItem);
			break;
		case ITEM17:
			setItem17(valorItem);
			break;
		case ITEM18:
			setItem18(valorItem);
			break;
		case ITEM19:
			setItem19(valorItem);
			break;
		case ITEM20:
			setItem20(valorItem);
			break;
		}
		
	}

	/**
	 * Get id mochila
	 * 
	 * @return int id mochila
	 */
	public int getIdMochila() {
		return idMochila;
	}

	/**
	 * Set id mochila
	 * 
	 * @param idMochila
	 *            int id
	 */
	public void setIdMochila(final int idMochila) {
		this.idMochila = idMochila;
	}

	/**
	 * Get item 1
	 * 
	 * @return int item1
	 */

	public int getItem1() {
		return item1;
	}

	/**
	 * Set item 1
	 * 
	 * @param item1
	 */
	public void setItem1(final int item1) {
		this.item1 = item1;
	}

	/**
	 * Get item 2
	 * 
	 * @return int item2
	 */
	public int getItem2() {
		return item2;
	}

	/**
	 * Set item 2
	 * 
	 * @param item2
	 */
	public void setItem2(final int item2) {
		this.item2 = item2;
	}

	/**
	 * Get item 3
	 * 
	 * @return int item3
	 */
	public int getItem3() {
		return item3;
	}

	/**
	 * Set item 3
	 * 
	 * @param item3
	 */
	public void setItem3(final int item3) {
		this.item3 = item3;
	}

	/**
	 * Get item 4
	 * 
	 * @return int item4
	 */
	public int getItem4() {
		return item4;
	}

	/**
	 * Set item 4
	 * 
	 * @param item4
	 */
	public void setItem4(final int item4) {
		this.item4 = item4;
	}

	/**
	 * Get item 5
	 * 
	 * @return int item5
	 */
	public int getItem5() {
		return item5;
	}

	/**
	 * Set item 5
	 * 
	 * @param item5
	 */
	public void setItem5(final int item5) {
		this.item5 = item5;
	}

	/**
	 * Get item 6
	 * 
	 * @return int item6
	 */
	public int getItem6() {
		return item6;
	}

	/**
	 * Set item 6
	 * 
	 * @param item6
	 */
	public void setItem6(final int item6) {
		this.item6 = item6;
	}

	/**
	 * Get item 7
	 * 
	 * @return int item7
	 */
	public int getItem7() {
		return item7;
	}

	/**
	 * Set item 7
	 * 
	 * @param item7
	 */
	public void setItem7(final int item7) {
		this.item7 = item7;
	}

	/**
	 * Get item 8
	 * 
	 * @return int item8
	 */
	public int getItem8() {
		return item8;
	}

	/**
	 * Set item 8
	 * 
	 * @param item8
	 */
	public void setItem8(final int item8) {
		this.item8 = item8;
	}

	/**
	 * Get item 9
	 * 
	 * @return int item9
	 */
	public int getItem9() {
		return item9;
	}

	/**
	 * Set item 9
	 * 
	 * @param item9
	 */
	public void setItem9(final int item9) {
		this.item9 = item9;
	}

	/**
	 * Get item 10
	 * 
	 * @return int item10
	 */
	public int getItem10() {
		return item10;
	}

	/**
	 * Set item 10
	 * 
	 * @param item10
	 */
	public void setItem10(final int item10) {
		this.item10 = item10;
	}

	/**
	 * Get item 11
	 * 
	 * @return int item1
	 */
	public int getItem11() {
		return item11;
	}

	/**
	 * Set item 11
	 * 
	 * @param item11
	 */
	public void setItem11(final int item11) {
		this.item11 = item11;
	}

	/**
	 * Get item 12
	 * 
	 * @return int item12
	 */
	public int getItem12() {
		return item12;
	}

	/**
	 * Set item 12
	 * 
	 * @param item12
	 */
	public void setItem12(final int item12) {
		this.item12 = item12;
	}

	/**
	 * Get item 13
	 * 
	 * @return int item13
	 */
	public int getItem13() {
		return item13;
	}

	/**
	 * Set item 13
	 * 
	 * @param item13
	 */
	public void setItem13(final int item13) {
		this.item13 = item13;
	}

	/**
	 * Get item 14
	 * 
	 * @return int item14
	 */
	public int getItem14() {
		return item14;
	}

	/**
	 * Set item 14
	 * 
	 * @param item14
	 */
	public void setItem14(final int item14) {
		this.item14 = item14;
	}

	/**
	 * Get item 15
	 * 
	 * @return int item15
	 */
	public int getItem15() {
		return item15;
	}

	/**
	 * Set item 15
	 * 
	 * @param item15
	 */
	public void setItem15(final int item15) {
		this.item15 = item15;
	}

	/**
	 * Get item 16
	 * 
	 * @return int item16
	 */
	public int getItem16() {
		return item16;
	}

	/**
	 * Set item 16
	 * 
	 * @param item16
	 */
	public void setItem16(final int item16) {
		this.item16 = item16;
	}

	/**
	 * Get item 17
	 * 
	 * @return int item17
	 */
	public int getItem17() {
		return item17;
	}

	/**
	 * Set item 17
	 * 
	 * @param item1
	 */
	public void setItem17(final int item17) {
		this.item17 = item17;
	}

	/**
	 * Get item 18
	 * 
	 * @return int item18
	 */
	public int getItem18() {
		return item18;
	}

	/**
	 * Set item 18
	 * 
	 * @param item18
	 */
	public void setItem18(final int item18) {
		this.item18 = item18;
	}

	/**
	 * Get item 19
	 * 
	 * @return int item19
	 */
	public int getItem19() {
		return item19;
	}

	/**
	 * Set item 199
	 * 
	 * @param item19
	 */
	public void setItem19(final int item19) {
		this.item19 = item19;
	}

	/**
	 * Get item 20
	 * 
	 * @return int item20
	 */
	public int getItem20() {
		return item20;
	}

	/**
	 * Set item 20
	 * 
	 * @param item20
	 */
	public void setItem20(final int item20) {
		this.item20 = item20;
	}
}