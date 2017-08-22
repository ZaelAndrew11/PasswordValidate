package cl.aguzman.passwordvalidate;

public class ValidationPassword {

    private ValidateCallback callback;

    public ValidationPassword(ValidateCallback callback) {
        this.callback = callback;
    }

    public void passwordValidate(String val){
        String value = val.toString().trim();
        if(value.length() > 8){
            callback.success(value);
        }else{
            callback.inputEmpty();
        }
    }
}
