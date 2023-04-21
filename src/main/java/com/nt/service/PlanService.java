package com.nt.service;

import java.util.List;
import java.util.Map;

import com.nt.entity.Plan;

    public interface PlanService {
    	public Map<Integer,String> getPlanCategories();
    	public List<Plan>getAllPlans();
    	public boolean savePlan(Plan plan);
    	public  Plan getPlanById(Integer planId);
    	public boolean updatePlan(Plan plan);
    	public boolean deletePlanById(Integer planId);
    	public boolean planStatusChange(Integer planId,String status);
    }