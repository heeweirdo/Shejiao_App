package test.bwie.com.shejiaoapp.utils.emoj;

import android.widget.TextView;

import com.hyphenate.easeui.EaseUI;
import com.hyphenate.easeui.domain.EaseUser;

/**
 * date: 2017/7/20
 * author:陈茹
 * 类的用途:
 */

public class EaseUserUtils {
    static EaseUI.EaseUserProfileProvider userProvider;

    static {
        userProvider = EaseUI.getInstance().getUserProfileProvider();
    }

    /**
     * get EaseUser according username
     * @param username
     * @return
     */
    public static EaseUser getUserInfo(String username){
        if(userProvider != null)
            return userProvider.getUser(username);

        return null;
    }



    /**
     * set user's nickname
     */
    public static void setUserNick(String username,TextView textView){
        if(textView != null){
            EaseUser user = getUserInfo(username);
            if(user != null && user.getNick() != null){
                textView.setText(user.getNick());
            }else{
                textView.setText(username);
            }
        }
    }

}