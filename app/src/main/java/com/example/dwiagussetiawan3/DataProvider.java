package com.example.dwiagussetiawan3;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import com.example.dwiagussetiawan3.model.Anjing;
import com.example.dwiagussetiawan3.model.Hewan;
import com.example.dwiagussetiawan3.model.Kucing;
import com.example.dwiagussetiawan3.model.Ular;

public class DataProvider {
    private static List<Hewan> hewans = new ArrayList<>();

    private static List<Kucing> initDataKucing(Context ctx) {
        List<Kucing> kucings = new ArrayList<>();
        kucings.add(new Kucing(ctx.getString(R.string.anggora_nama), ctx.getString(R.string.anggora_asal),
                ctx.getString(R.string.anggora_deskripsi), R.drawable.kucing_anggora));
        kucings.add(new Kucing(ctx.getString(R.string.bengal_nama), ctx.getString( R.string.bengal_asal),
                ctx.getString(R.string.bengal_deskripsi),R.drawable.kucing_bengal));
        kucings.add(new Kucing(ctx.getString(R.string.birmani_nama), ctx.getString(R.string.birmani_asal),
                ctx.getString(R.string.birmani_deskripsi), R.drawable.kucing_birmani));
        kucings.add(new Kucing(ctx.getString(R.string.persia_nama), ctx.getString(R.string.persia_asal),
                ctx.getString(R.string.persia_deskripsi), R.drawable.kucing_persia));
        kucings.add(new Kucing(ctx.getString(R.string.siam_nama), ctx.getString(R.string.siam_asal),
                ctx.getString(R.string.siam_deskripsi), R.drawable.kucing_siam));
        kucings.add(new Kucing(ctx.getString(R.string.siberia_nama), ctx.getString(R.string.siberia_asal),
                ctx.getString(R.string.siberia_deskripsi), R.drawable.kucing_siberia));
        return kucings;
    }

    private static List<Anjing> initDataAnjing(Context ctx) {
        List<Anjing> anjings = new ArrayList<>();
        anjings.add(new Anjing(ctx.getString(R.string.bulldog_nama), ctx.getString(R.string.bulldog_asal),
                ctx.getString(R.string.bulldog_deskripsi), R.drawable.anjing_bulldog));
        anjings.add(new Anjing(ctx.getString(R.string.husky_nama), ctx.getString(R.string.husky_asal),
                ctx.getString(R.string.husky_deskripsi), R.drawable.anjing_husky));
        anjings.add(new Anjing(ctx.getString(R.string.kintamani_nama), ctx.getString(R.string.kintamani_asal),
                ctx.getString(R.string.kintamani_deskripsi), R.drawable.anjing_kintamani));
        anjings.add(new Anjing(ctx.getString(R.string.samoyed_nama), ctx.getString(R.string.samoyed_asal),
                ctx.getString(R.string.samoyed_deskripsi), R.drawable.anjing_samoyed));
        anjings.add(new Anjing(ctx.getString(R.string.shepherd_nama), ctx.getString(R.string.shepherd_asal),
                ctx.getString(R.string.shepherd_deskripsi), R.drawable.anjing_shepherd));
        anjings.add(new Anjing(ctx.getString(R.string.shiba_nama), ctx.getString(R.string.shiba_asal),
                ctx.getString(R.string.shiba_deskripsi), R.drawable.anjing_sibha));
        return anjings;
    }

    private static List<Ular> initDataUlar(Context ctx) {
        List<Ular> ulars = new ArrayList<>();
        ulars.add(new Ular(ctx.getString(R.string.cobra_nama), ctx.getString(R.string.cobra_asal),
                ctx.getString(R.string.cobra_deskripsi), R.drawable.ular_kobra));
        ulars.add(new Ular(ctx.getString(R.string.sanca_nama), ctx.getString(R.string.sanca_asal),
                ctx.getString(R.string.sanca_deskripsi), R.drawable.ular_sanca));
        ulars.add(new Ular(ctx.getString(R.string.anaconda_nama), ctx.getString(R.string.anaconda_asal),
                ctx.getString(R.string.anaconda_deskripsi), R.drawable.ular_anaconda));
        ulars.add(new Ular(ctx.getString(R.string.phyton_nama), ctx.getString(R.string.phyton_asal),
                ctx.getString(R.string.phyton_deskripsi), R.drawable.ular_python));
        ulars.add(new Ular(ctx.getString(R.string.beludak_nama), ctx.getString(R.string.beludak_asal),
                ctx.getString(R.string.beludak_deskripsi), R.drawable.ular_beludak));
        ulars.add(new Ular(ctx.getString(R.string.mamba_nama), ctx.getString(R.string.mamba_asal),
                ctx.getString(R.string.mamba_deskripsi), R.drawable.ular_mamba));
        return ulars;
    }

    private static void initAllHewans(Context ctx) {
        hewans.addAll(initDataKucing(ctx));
        hewans.addAll(initDataAnjing(ctx));
        hewans.addAll(initDataUlar(ctx));
    }

    public static List<Hewan> getAllHewan(Context ctx) {
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        return  hewans;
    }

    public static List<Hewan> getHewansByTipe(Context ctx, String jenis) {
        List<Hewan> hewansByType = new ArrayList<>();
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        for (Hewan h : hewans) {
            if (h.getJenis().equals(jenis)) {
                hewansByType.add(h);
            }
        }
        return hewansByType;
    }

}