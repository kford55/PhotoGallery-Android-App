package kennethford.photogallery;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class PhotoGalleryActivity extends SingleFragmentActivity {

    public PhotoGalleryFragment createFragment() {
        return PhotoGalleryFragment.newInstance();
    }
}
