package com.teamtreehouse.albumcover.sandbox;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.jimulabs.mirrorsandbox.MirrorSandboxBase;
import com.teamtreehouse.albumcover.R;

import butterknife.ButterKnife;
import butterknife.BindView;

/**
 * Created by lintonye on 15-10-07.
 */
public class AlbumDetailBox extends MirrorSandboxBase {

    @BindView(R.id.album_art)
    ImageView albumArtView;
    @BindView(R.id.fab)
    ImageButton fab;
    @BindView(R.id.title_panel)
    ViewGroup cyanPanel;
    @BindView(R.id.track_panel)
    ViewGroup whitePanel;
    @BindView(R.id.detail_container)
    ViewGroup detailContainer;

    public AlbumDetailBox(View rootView) {
        super(rootView);
        ButterKnife.bind(this, rootView);
    }

    @Override
    public void $onLayoutDone(View rootView) {
        // Put animation code here
    }
}
