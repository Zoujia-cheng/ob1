﻿package com.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Diaochaxinxi {
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	private String diaochabianhao;
    private String addtime;

    

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
	
	public String getDiaochabianhao() {
        return diaochabianhao;
    }
    public void setDiaochabianhao(String diaochabianhao) {
        this.diaochabianhao = diaochabianhao == null ? null : diaochabianhao.trim();
    }
        return huatimingcheng;
    }
    public void setHuatimingcheng(String huatimingcheng) {
        this.huatimingcheng = huatimingcheng == null ? null : huatimingcheng.trim();
    }
        return diaochamingcheng;
    }
    public void setDiaochamingcheng(String diaochamingcheng) {
        this.diaochamingcheng = diaochamingcheng == null ? null : diaochamingcheng.trim();
    }
        return canyurenshu;
    }
    public void setCanyurenshu(String canyurenshu) {
        this.canyurenshu = canyurenshu == null ? null : canyurenshu.trim();
    }
        return diaochazhi;
    }
    public void setDiaochazhi(String diaochazhi) {
        this.diaochazhi = diaochazhi == null ? null : diaochazhi.trim();
    }
        return zongzhi;
    }
    public void setZongzhi(String zongzhi) {
        this.zongzhi = zongzhi == null ? null : zongzhi.trim();
    }
        return gongsibianhao;
    }
    public void setGongsibianhao(String gongsibianhao) {
        this.gongsibianhao = gongsibianhao == null ? null : gongsibianhao.trim();
    }
        return issh;
    }
    public void setIssh(String issh) {
        this.issh = issh == null ? null : issh.trim();
    }
	
	
    public String getAddtime() {
        return addtime;
    }
    public void setAddtime(String addtime) {
        this.addtime = addtime == null ? null : addtime.trim();
    }
}
//   设置字段信息