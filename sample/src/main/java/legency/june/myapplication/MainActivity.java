package legency.june.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import com.michaelfotiadis.steam.SteamLoader;
import com.michaelfotiadis.steam.data.ResponseContainer;
import com.michaelfotiadis.steam.data.steam.users.user.PlayerSummaries;
import com.michaelfotiadis.steam.net.callback.Reason;
import com.michaelfotiadis.steam.provider.SteamCallback;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new SteamLoader("D6BD33A458D6E9661B82799E773FA329").getUsersProvider().getPlayerSummaries(
            new String[] {"76561198105817738"},
            new SteamCallback<ResponseContainer<PlayerSummaries>>() {
                @Override
                public void onSuccess(ResponseContainer<PlayerSummaries> result) {
                    PlayerSummaries s = result.getResponse();
                    Log.d("asdasd", s.getPlayers().get(0).getAvatarFull());
                }

                @Override
                public void onError(Reason reason, int httpStatus) {

                }
            });
    }
}
