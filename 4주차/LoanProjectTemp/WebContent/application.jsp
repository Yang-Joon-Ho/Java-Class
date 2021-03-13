<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author"
	content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
<meta name="generator" content="Jekyll v4.1.1">
<title>Checkout example �� Bootstrap</title>

<link rel="canonical"
	href="https://getbootstrap.com/docs/4.5/examples/checkout/">

<!-- Bootstrap core CSS -->
<link href="/docs/4.5/dist/css/bootstrap.min.css" rel="stylesheet"
	integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2"
	crossorigin="anonymous">


<!-- JS -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
	integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
	crossorigin="anonymous"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"
	integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI"
	crossorigin="anonymous"></script>

<!-- Bootstrap core CSS -->
<link href="/docs/4.5/dist/css/bootstrap.min.css" rel="stylesheet"
	integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2"
	crossorigin="anonymous">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"
	integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk"
	crossorigin="anonymous">

<!-- ������Ʈ -->
<link
	href="https://fonts.googleapis.com/css?family=Stylish&display=swap"
	rel="stylesheet">

<link rel="canonical"
	href="https://getbootstrap.com/docs/4.5/examples/blog/">

<!-- css ���� ���� -->
<link href="<%=request.getContextPath()%>/resources/css/index.css"
	rel="stylesheet">

<!-- Custom styles for this template -->
<link
	href="https://fonts.googleapis.com/css?family=Playfair+Display:700,900"
	rel="stylesheet">
<!-- Custom styles for this template -->

<!-- Custom styles for this template -->
<link href="form-validation.css" rel="stylesheet">
</head>


<body class="bg-light">
	<div class="container">
		<div class="py-5 text-center">
			<img class="d-block mx-auto mb-4"
				src="/docs/4.5/assets/brand/bootstrap-solid.svg" alt="" width="72"
				height="72">
			<h2>Checkout form</h2>
			<p class="lead">Below is an example form built entirely with
				Bootstrap��s form controls. Each required form group has a validation
				state that can be triggered by attempting to submit the form without
				completing it.</p>
		</div>
		
		<div class="row">
			<div class="col-md-4 order-md-2 mb-4">
				<h4 class="d-flex justify-content-between align-items-center mb-3">
					<span class="text-muted">Your cart</span> <span
						class="badge badge-secondary badge-pill">3</span>
				</h4>
				<ul class="list-group mb-3">
					<li
						class="list-group-item d-flex justify-content-between lh-condensed">
						<div>
							<h6 class="my-0">Product name</h6>
							<small class="text-muted">Brief description</small>
						</div> <span class="text-muted">$12</span>
					</li>
					<li
						class="list-group-item d-flex justify-content-between lh-condensed">
						<div>
							<h6 class="my-0">Second product</h6>
							<small class="text-muted">Brief description</small>
						</div> <span class="text-muted">$8</span>
					</li>
					<li
						class="list-group-item d-flex justify-content-between lh-condensed">
						<div>
							<h6 class="my-0">Third item</h6>
							<small class="text-muted">Brief description</small>
						</div> <span class="text-muted">$5</span>
					</li>
					<li class="list-group-item d-flex justify-content-between bg-light">
						<div class="text-success">
							<h6 class="my-0">Promo code</h6>
							<small>EXAMPLECODE</small>
						</div> <span class="text-success">-$5</span>
					</li>
					<li class="list-group-item d-flex justify-content-between"><span>Total
							(USD)</span> <strong>$20</strong></li>
				</ul>
				<form class="card p-2">
					<div class="input-group">
						<input type="text" class="form-control" placeholder="Promo code">
						<div class="input-group-append">
							<button type="submit" class="btn btn-secondary">Redeem</button>
						</div>
					</div>
				</form>
			</div>
			
			<div class="col-md-8 order-md-1">
				<h4 class="mb-3">Billing address</h4>
				
				<form class="needs-validation" action="application.do" method = "post" novalidate>
					<div class="row">
						<div class="col-md-6 mb-3">
							<label for="id">Id</label> <input type="text"
								class="form-control" name="id" id="id" placeholder="${dto.id }" value="${dto.id }"
								required>
							<div class="invalid-feedback">Valid name is required.
							</div>
						</div>
						 <div class="col-md-6 mb-3">
           					 <label for="password">Password</label>
            			     <input type="text" class="form-control" name="password" id="password" placeholder="" value="" required>
            				 <div class="invalid-feedback">
              					Valid last name is required.
            				 </div>
          				 </div>
					</div>

					<div class="mb-3">
						<label for="name">Name</label>
						<div class="input-group">
							<div class="input-group-prepend">
								<span class="input-group-text">@</span>
							</div>
							<input type="text" name="name" class="form-control" id="name"
								placeholder="name" required>
							<div class="invalid-feedback" style="width: 100%;">Your
								username is required.</div>
						</div>
					</div>

					<div class="mb-3">
						<label for="email">Email <span class="text-muted">(Optional)</span></label>
						<input type="email" class="form-control" name="email" id="email"
							placeholder="you@example.com">
						<div class="invalid-feedback">Please enter a valid email
							address for shipping updates.</div>
					</div>

					<div class="mb-3">
						<label for="address">Address</label> <input type="text" name="address"
							class="form-control" id="address" placeholder="1234 Main St"
							required>
						<div class="invalid-feedback">Please enter your shipping
							address.</div>
					</div>

					<div class="mb-3">
						<label for="account">Account</label> <input type="text" name="account"
							class="form-control" id="account" placeholder="���� ��ȣ"
							required>
						<div class="invalid-feedback">Please enter your shipping
							address.</div>
					</div>
					
					<div class="mb-3">
						<label for="amount">Amount</label> <input type="text" name="amount"
							class="form-control" id="amount" placeholder="��û �ݾ�"
							required>
						<div class="invalid-feedback">Please enter your shipping
							address.</div>
					</div>
					
					<div class="row">
						<div class="col-md-5 mb-3">
							<label for="bank">Bank</label> <select
								class="custom-select d-block w-100" id="bank" name="bank" required>
								<option value="">Choose...</option>
								<option>�츮����</option>
								<option>�������</option>
								<option>��ȣ����</option>
								<option>�������</option>
							</select>
							<div class="invalid-feedback">Please select a valid
								country.</div>
						</div>
						
						<div class="col-md-4 mb-3">
							<label for="state">State</label> <select
								class="custom-select d-block w-100" id="state" required>
								<option value="">Choose...</option>
								<option>California</option>
							</select>
							<div class="invalid-feedback">Please provide a valid state.
							</div>
						</div>
						<div class="col-md-3 mb-3">
							<label for="zip">Zip</label> <input type="text"
								class="form-control" id="zip" placeholder="" required>
							<div class="invalid-feedback">Zip code required.</div>
						</div>
					</div>
					
					<div class="mb-3">
						<label for="company">Company</label> <input type="text" name="company"
							class="form-control" id="company" placeholder="ȸ���"
							required>
						<div class="invalid-feedback">Please enter your shipping
							address.</div>
					</div>
					<div class="mb-3">
						<label for="license">license number</label> <input type="text" name="license"
							class="form-control" id="license" placeholder="����ڵ�Ϲ�ȣ"
							required>
						<div class="invalid-feedback">Please enter your shipping
							address.</div>
					</div>
					
					<hr class="mb-4">
					<div class="custom-control custom-checkbox">
						<input type="checkbox" class="custom-control-input"
							id="same-address"> <label class="custom-control-label"
							for="same-address">Shipping address is the same as my
							billing address</label>
					</div>
					<div class="custom-control custom-checkbox">
						<input type="checkbox" class="custom-control-input" id="save-info">
						<label class="custom-control-label" for="save-info">Save
							this information for next time</label>
					</div>
					<hr class="mb-4">

					<h4 class="mb-3">Payment</h4>

					<div class="d-block my-3">
						<div class="custom-control custom-radio">
							<input id="credit" name="paymentMethod" type="radio"
								class="custom-control-input" checked required> <label
								class="custom-control-label" for="credit">Credit card</label>
						</div>
						<div class="custom-control custom-radio">
							<input id="debit" name="paymentMethod" type="radio"
								class="custom-control-input" required> <label
								class="custom-control-label" for="debit">Debit card</label>
						</div>
						<div class="custom-control custom-radio">
							<input id="paypal" name="paymentMethod" type="radio"
								class="custom-control-input" required> <label
								class="custom-control-label" for="paypal">PayPal</label>
						</div>
					</div>
					<div class="row">
						<div class="col-md-6 mb-3">
							<label for="cc-name">Name on card</label> <input type="text"
								class="form-control" id="cc-name" placeholder="" required>
							<small class="text-muted">Full name as displayed on card</small>
							<div class="invalid-feedback">Name on card is required</div>
						</div>
						<div class="col-md-6 mb-3">
							<label for="cc-number">Credit card number</label> <input
								type="text" class="form-control" id="cc-number" placeholder=""
								required>
							<div class="invalid-feedback">Credit card number is
								required</div>
						</div>
					</div>
					<div class="row">
						<div class="col-md-3 mb-3">
							<label for="cc-expiration">Expiration</label> <input type="text"
								class="form-control" id="cc-expiration" placeholder="" required>
							<div class="invalid-feedback">Expiration date required</div>
						</div>
						<div class="col-md-3 mb-3">
							<label for="cc-cvv">CVV</label> <input type="text"
								class="form-control" id="cc-cvv" placeholder="" required>
							<div class="invalid-feedback">Security code required</div>
						</div>
					</div>
					<hr class="mb-4">
					<button class="btn btn-primary btn-lg btn-block" type="submit">Continue
						to checkout</button>
				
				</form>
			</div>
		</div>

		<footer class="my-5 pt-5 text-muted text-center text-small">
			<p class="mb-1">&copy; 2017-2020 Company Name</p>
			<ul class="list-inline">
				<li class="list-inline-item"><a href="#">Privacy</a></li>
				<li class="list-inline-item"><a href="#">Terms</a></li>
				<li class="list-inline-item"><a href="#">Support</a></li>
			</ul>
		</footer>
	</div>
</body>

</html>