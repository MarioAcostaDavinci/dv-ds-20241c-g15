package ar.edu.davinci.dv_ds_20241c_g15.exceptions;
public class BusinessException extends Exception {
	
	private static final long serialVersionUID = -2802884204483190033L;

	public BusinessException(String mensaje) {
		super(mensaje);
	}
}