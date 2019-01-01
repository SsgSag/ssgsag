package com.example.dohee.ssgsag.SignUp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.dohee.ssgsag.MainActivity
import com.example.dohee.ssgsag.R
import kotlinx.android.synthetic.main.activity_signup4.*
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.toast

class SignUp4 : AppCompatActivity() {
    var ideaclick: Int = 0
    var cameraclick: Int = 0
    var designclick: Int = 0
    var marketingclick: Int = 0
    var techclick: Int = 0
    var literatureclick: Int = 0
    var scholarshipclick: Int = 0
    var healthclick: Int = 0
    var startupclick: Int = 0
    var artclick: Int = 0
    var economyclick: Int = 0
    var societyclick: Int = 0
    var nextclick: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup4)
        setOnBtnClickListener()
    }

    override fun onBackPressed() {
        startActivity<SignUp3>()
        finish()
        super.onBackPressed()
    }

    private fun setOnBtnClickListener() {
        iv_back_4.setOnClickListener {
            startActivity<SignUp3>()
            finish()
        }
        // 기획/아이디어
        btn_idea.setOnClickListener {
            ideaclick = 1 - ideaclick
            if (ideaclick==1){
                btn_idea.setImageResource(R.drawable.bt_preference_idea_active)
                btn_start.setImageResource(R.drawable.bt_start)
            } else {
                btn_idea.setImageResource(R.drawable.bt_preference_idea_unactive)
                btn_start.setImageResource(R.drawable.bt_start_unactive)
            }
        }

        btn_camera.setOnClickListener {
            cameraclick = 1 - cameraclick
            if (cameraclick==1){
                btn_camera.setImageResource(R.drawable.bt_preference_camera_active)
                btn_start.setImageResource(R.drawable.bt_start)
            } else {
                btn_camera.setImageResource(R.drawable.bt_preference_camera_unactive)
                btn_start.setImageResource(R.drawable.bt_start_unactive)
            }
        }
        btn_design.setOnClickListener {
            designclick = 1 - designclick
            if (designclick==1){
                btn_design.setImageResource(R.drawable.bt_preference_design_active)
                btn_start.setImageResource(R.drawable.bt_start)
            } else {
                btn_design.setImageResource(R.drawable.bt_preference_design_unactive)
                btn_start.setImageResource(R.drawable.bt_start_unactive)}
        }
        btn_marketing.setOnClickListener {
            marketingclick = 1 - marketingclick
            if (marketingclick==1){
                btn_marketing.setImageResource(R.drawable.bt_preference_marketing_active)
                btn_start.setImageResource(R.drawable.bt_start)
            } else {
                btn_marketing.setImageResource(R.drawable.bt_preference_marketing_unactive)
                btn_start.setImageResource(R.drawable.bt_start_unactive)}
        }
        btn_tech.setOnClickListener {
            techclick = 1 - techclick
            if (techclick==1){
                btn_tech.setImageResource(R.drawable.bt_preference_tech_active)
                btn_start.setImageResource(R.drawable.bt_start)
            } else {
                btn_tech.setImageResource(R.drawable.bt_preference_tech_unactive)
                btn_start.setImageResource(R.drawable.bt_start_unactive)}
        }
        btn_literature.setOnClickListener {
            literatureclick = 1 - literatureclick
            if (literatureclick==1){
                btn_literature.setImageResource(R.drawable.bt_preference_literature_active)
                btn_start.setImageResource(R.drawable.bt_start)
            } else {
                btn_literature.setImageResource(R.drawable.bt_preference_literature_unactive)
                btn_start.setImageResource(R.drawable.bt_start_unactive)}
        }
        btn_scholarship.setOnClickListener {
            scholarshipclick = 1 - scholarshipclick
            if (scholarshipclick==1){
                btn_scholarship.setImageResource(R.drawable.bt_preference_sholarship_active)
                btn_start.setImageResource(R.drawable.bt_start)
            } else {
                btn_scholarship.setImageResource(R.drawable.bt_preference_sholarship_unactive)
                btn_start.setImageResource(R.drawable.bt_start_unactive)}
        }
        btn_health.setOnClickListener {
            healthclick = 1 - healthclick
            if (healthclick==1){
                btn_health.setImageResource(R.drawable.bt_preference_health_active)
                btn_start.setImageResource(R.drawable.bt_start)
            } else {
                btn_health.setImageResource(R.drawable.bt_preference_health_unactive)
                btn_start.setImageResource(R.drawable.bt_start_unactive)}
        }
        btn_startup.setOnClickListener {
            startupclick = 1 - startupclick
            if (startupclick==1){
                btn_startup.setImageResource(R.drawable.bt_preference_startup_active)
                btn_start.setImageResource(R.drawable.bt_start)
            } else {
                btn_startup.setImageResource(R.drawable.bt_preference_startup_unactive)
                btn_start.setImageResource(R.drawable.bt_start_unactive)}
        }
        btn_art.setOnClickListener {
            artclick = 1 - artclick
            if (artclick==1){
                btn_art.setImageResource(R.drawable.bt_preference_art_active)
                btn_start.setImageResource(R.drawable.bt_start)
            } else {
                btn_art.setImageResource(R.drawable.bt_preference_art_unactive)
                btn_start.setImageResource(R.drawable.bt_start_unactive)}
        }
        btn_economy.setOnClickListener {
            economyclick = 1 - economyclick
            if (economyclick==1){
                btn_economy.setImageResource(R.drawable.bt_preference_economy_active)
                btn_start.setImageResource(R.drawable.bt_start)
            } else {
                btn_economy.setImageResource(R.drawable.bt_preference_economy_unactive)
                btn_start.setImageResource(R.drawable.bt_start_unactive)}
        }
        btn_society.setOnClickListener {
            societyclick = 1 - societyclick
            if (societyclick==1){
                btn_society.setImageResource(R.drawable.bt_preference_society_active)
                btn_start.setImageResource(R.drawable.bt_start)
            } else {
                btn_society.setImageResource(R.drawable.bt_preference_society_unactive)
                btn_start.setImageResource(R.drawable.bt_start_unactive)}
        }
        btn_start.setOnClickListener {
            if (ideaclick==1 || cameraclick == 1 || designclick == 1 || marketingclick == 1 || techclick ==1 || literatureclick == 1 || scholarshipclick == 1 || healthclick == 1 || startupclick == 1|| artclick ==1|| economyclick == 1 || societyclick==1){
                btn_start.setImageResource(R.drawable.bt_start)
                startActivity<MainActivity>()
                finish()
            } else {btn_start.setImageResource(R.drawable.bt_start_unactive)}
        }
    }
}
