package models.validators;

import models.Task;

public class Taskvalidator {
    public static String validate(Task t){

        String content_error =_validateContent(t.getContent());
        if(!content_error.equals("")){
            String errors=content_error;
            return errors;
        }else{
            return "";
        }

    }

    private static  String _validateContent(String content){
        if(content == null || content.equals("")){
            return "タスクを入力してください。";
        }

        return "";
    }

}
