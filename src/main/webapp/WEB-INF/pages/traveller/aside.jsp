<%--
   旅客的操作功能：
       1.选择旅行社
       2.自己购票
       3.进本信息查看
       4.账户管理
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false" errorPage="404.jsp"%>

<aside class="main-sidebar">
	<!-- sidebar: style can be found in sidebar.less -->
	<section class="sidebar">
		<!-- Sidebar user panel -->
		<div class="user-panel">
			<div class="pull-left image">
				<img src="${pageContext.request.contextPath}/img/img2.png"
					class="img-circle" alt="User Image">
			</div>
			<div class="pull-left info">
				<p>${user.userName}</p>
				<a href="#"><i class="fa fa-circle text-success"></i> 在线</a>
			</div>
		</div>

		<!-- sidebar menu: : style can be found in sidebar.less -->
		<ul class="sidebar-menu">
			<li class="header">菜单</li>
			<li id="admin-index"><a
					href="${pageContext.request.contextPath}/travellerController/main"><i
					class="fa fa-dashboard"></i> <span>首页</span></a></li>

			<li class="treeview"><a href="#"> <i class="fa fa-cogs"></i>
				<span>信息管理</span> <span class="pull-right-container"> <i
						class="fa fa-angle-left pull-right"></i>
				</span>


			</a>
				<ul class="treeview-menu">

					<li id="system-setting"><a
							href="${pageContext.request.contextPath}/travellerController/traveller-info"> <i
							class="fa fa-circle-o"></i> 基本信息
					</a></li>

				</ul></li>
			<li class="treeview"><a href="#"> <i class="fa fa-cube"></i>
				<span>旅行社信息</span> <span class="pull-right-container"> <i
						class="fa fa-angle-left pull-right"></i>
				</span>
			</a>
				<ul class="treeview-menu">

					<li id="system-setting"><a
							href="${pageContext.request.contextPath}/travellerController/findAllAgency">
						<i class="fa fa-circle-o"></i> 旅行社列表
					</a></li>
					<li id="system-setting"><a
							href="${pageContext.request.contextPath}/travellerController/findMyAgencies?tid=${user.id}">
						<i class="fa fa-circle-o"></i> 我的旅行社
					</a></li>
				</ul></li>
			<li class="treeview"><a href="#"> <i class="fa fa-plane"></i>
				<span>航班信息</span> <span class="pull-right-container"> <i
						class="fa fa-angle-left pull-right"></i>
				</span>
			</a>
				<ul class="treeview-menu">

					<li id="system-setting"><a
							href="${pageContext.request.contextPath}/travellerController/findAllFlight">
						<i class="fa fa-circle-o"></i> 航班列表
					</a></li>
				</ul></li>

			<li class="treeview"><a href="#"> <i class="fa fa-shopping-cart"></i>
				<span>订单管理</span> <span class="pull-right-container"> <i
						class="fa fa-angle-left pull-right"></i>
				</span>
			</a>
				<ul class="treeview-menu">

					<li id="system-setting"><a
							href="${pageContext.request.contextPath}/travellerController/findPayOrder?tid=${user.id}">
						<i class="fa fa-circle-o"></i> 已支付订单
					</a></li>
					<li id="system-setting"><a
							href="${pageContext.request.contextPath}/travellerController/findNoPayOrder?tid=${user.id}">
						<i class="fa fa-circle-o"></i> 未支付订单
					</a></li>
				</ul></li>
		</ul>
	</section>
	<!-- /.sidebar -->
</aside>