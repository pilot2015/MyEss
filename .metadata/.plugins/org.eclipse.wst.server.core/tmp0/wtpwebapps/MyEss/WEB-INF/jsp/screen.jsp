
<%@ page contentType="text/html; charset=gb2312"%>

<div id="expenseReport" class="reportSection">
	<a class="titleForm" href="javascript: void hideDataFields('expenseReport', showDataFields('expenseReportHidden'), hideDataFields('expenseReportOptions'))">Expense Report&nbsp;<span id="reportUsersReference"></span></a>
    <form id="screenPurpose">            
          <input type="hidden" name="xref" value="XXX">
          <input type="hidden" name="setPointer" value="No">
          <input type="hidden" name="clientno" >
          <input type="hidden" name="client" >
		<div class="col1of2">
			<div class="size1of2">
				<label for="begdate">From <span>*</span></label>
				<input id="begdate" type="text" name="begdate" value="" mysubst="1" onBlur="resetLowerDate1()" onChange="checkdate(begdate);setRepChgd()">
				<a HREF="javascript:doNothing()" mysubst="2" onClick="setDateField(document.forms.screenPurpose.begdate); top.newWin = window.open('/WEB-INF/javascript/calendar.html', 'cal', 'dependent=yes, width=210, height=230, screenX=200, screenY=300, titlebar=yes')"><img SRC="images/calendar.gif" /></a>
			</div>
			<div class="size1of2">
				<label for="enddate">To <span>*</span></label>
				<input id="enddate" type="text" name="enddate" value="" onBlur="resetUpperDate()" onChange="checkdate(enddate);setRepChgd()">
				<a HREF="javascript:doNothing()" onClick="setDateField(document.forms.screenPurpose.enddate); top.newWin = window.open('/WEB-INF/javascript/calendar.html', 'cal', 'dependent=yes, width=210, height=230, screenX=200, screenY=300, titlebar=yes')"><img SRC="images/calendar.gif" /></a>
			</div>
            <label for="comment">Purpose <span>*</span></label>
			<input type="text" id="comment" name="comment" onChange="setRepChgd()" />
			<span id="prepopButton"></span><!-- This is just for testing. Move someplace better -->
			<!--<label for="location">location <span>*</span></label>
            <select id="location" name="locationname" xref="location"></select>-->
		</div>
		<div class="col1of2">
        	<label for="department">Cost center <span>*</span></label>
            <select id="department" name="departmentname" xref="department" onChange="setRepChgd()"></select>
         	<!--<label for="project">project #</label>
            <select id="project" name="projectname" xref="project"></select>-->
		</div>
         <!--<div id="projectEntry" style="display: none">
          </div>
         <div id="clientNoEntry" style="display: none">
         <label for="clientno" class="ExpenseTag">client #</label>
         <input id="clientLookup" type="text" name="clientLookup" onChange="populateClient()" subtype="nosave">
         <a class="ExpenseLink" href="javascript:doNothing()" onClick="setLocalObj(clientLookup,'addclient',400,450); MerchantType = 'client'; top.newWin = window.open('/ess/' + parent.language + '/addclient.html', 'merchant', 'dependent=yes, width=400, height=400, screenX=100, screenY=100, titlebar=yes, menubar=no, status=no')">New&nbsp;Client&nbsp;</a>
          <select name="clientLookup" size="1" onChange="populateClient()" onReturn="populateClient()"></select>
         </div>
         <div id="ClientNameEntry" style="display: none">
         <label for="client" class="ExpenseTag">client name</label>
         <input type="text" id="client" name="client">
         </div>
         <div style="display: none">
         <label for="stepno" class="ExpenseTag">aircraft type</label>
         <select id="stepno" name="stepno">
              <option selected>None</option>
              <option>Commercial</option> 
              <option>Corporate</option>
          </select>
          </div>
         <a href="javascript: void showDataFields('projectEntry')"><span class="ExpenseLink">Project</span></a>
         <a href="javascript: void showDataFields('clientNoEntry','ClientNameEntry')"><span class="ExpenseLink">Client</span></a>-->      
    </form>

    <div id="advanceSection" style="display: none">
        <a href="javascript: void hideDataFields('advanceSection', showDataFields('addAdvance'), hideDataFields('removeAdvance'))"><h2>Cash Advance</h2></a>
        <form name="advanceEntry" id="advanceEntry">
          <input type="hidden" name="charge" value>
          <input type="hidden" name="setPointer" value="No" subtype="nosave">
          
		<div class="col1of3">
			<label for="rcptdate">Advance issue date<span>*</span></label>
			<input id="rcptdate" type="text" name="rcptdate" value="" onChange="setRepChgd()" />
			<a HREF="javascript:doNothing()" tabindex="2" onClick="setDateField(document.forms.advanceEntry.rcptdate);top.newWin = window.open('/ess/calendar.html', 'cal', 'dependent=yes, width=210, height=230, screenX=200, screenY=300, titlebar=yes')"><img SRC="/ess/calendar.gif" /></a>
		</div>
        <div class="col1of3">
			<label for="amount">Advance amount<span>*</span></label>
			<input id="amount" type="text" name="amount" value="" onChange="CheckAmount(this.form.amount);printTotals();setRepChgd()" />
		</div>
        <div class="col1of3">
			<label for="refer">Advance purpose</label>
			<input id="refer" type="text" name="refer" onChange="setRepChgd()" />
          </div>
        </form>
        
		<!--<form name="returnEntry" id="returnEntry">
            <input type="hidden" name="charge" value>
			<input type="hidden" name="setPointer" value="No" subtype="nosave">
            
            <div class="col1of3">
            <label for="rcptdate">current date</label>
            <input type="text" name="rcptdate" />
            <a HREF="javascript:doNothing()" tabindex="2" onClick="setDateField(document.forms.returnEntry.rcptdate);"><img SRC="/ess/calendar.gif" /></a>
            </div>
            <div class="col1of3">
            <label for="amount">amount returned</label>
			<input type="text" name="amount" value="" onChange="CheckAmount(this.form.amount);printTotals()" />
            </div>
            <div class="col1of3">
			<label for="refer">check #</label>
			<input id="refer" type="text" name="refer" />
            </div>
        </form>--> 
    </div>
</div>

<div id="expenseReportOptions" class="formOptions">
	<span id="addAdvance">add <a href="javascript: void showDataFields('advanceSection', showDataFields('removeAdvance'), hideDataFields('addAdvance'))">Advance</a></span>
    <span id="removeAdvance" style="display:none;">close <a href="javascript: void hideDataFields('advanceSection', showDataFields('addAdvance'), hideDataFields('removeAdvance'))">Advance</a></span>
</div>
<div id="expenseReportHidden" class="reportSection" style="display:none;">
	<a class="titleForm" href="javascript: void showDataFields('expenseReport', showDataFields('expenseReportOptions'), hideDataFields('expenseReportHidden'))">Expense Report&nbsp;<span id="reportUsersReference"></span></a>
    <div><a href="javascript: void showDataFields('expenseReport', showDataFields('expenseReportOptions'), hideDataFields('expenseReportHidden'))">click here <span>to open Expense Report</span></a></div>
</div>


<div id="mileageSection" class="reportSection">
	<a class="titleForm" href="javascript: void hideDataFields('mileageSection', showDataFields('mileageSectionHidden'), hideDataFields('mileageSectionOptions'))">Mileage</a>
    <table cellspacing="0" cellpadding="0">
    	<thead>
			<tr>
				<th class="mileageDate">Date<span class="star">*</span></th>
				<th class="mileageLabel"><span id="mileageLabel">Kilometer</span><span class="star">*</span></th>
				<th class="mileageRate1">Rate</th>
				<th class="mileageAmount1">Amount</th>
                <th class="mileageProject1">Int. order</th>
                <th class="mileageLocation">Location<span class="star">*</span></th>
				<th class="mileageFrom">From</th>
				<th class="mileageComment1">To / comments</th>
				<th class="mileageDelete" />
			</tr>
		</thead>
    </table>
    <span id="defaultMileage">
    <form name="screenMileage">
        <input type="hidden" name="rcpttype" value="4">
        <input type="hidden" name="expense_1_purpose" value="wizard">
        <input type="hidden" name="expense_1_xref" value>
        <input type="hidden" name="expense_1_expensetype" value>
        <input type="hidden" name="charge" value> 
        <input type="hidden" name="units" value>
        <input type="hidden" name="expense_1_billtype" value="No">
		<input type="hidden" name="okstatus" value>
		<input type="hidden" name="okref" value><input type="hidden" name="scanref" value>
        <input type="hidden" name="setPointer" value="No" subtype="nosave">
        <input type="hidden" name="persistance" value="New" subtype="nosave">
      <table cellspacing="0" cellpadding="0">
        <tr>
          <td class="mileageDate"><input type="text" name="rcptdate" value="" onChange="screenDate(rcptdate)" onBlur="getProperFgnRate(this.form)"><a HREF="javascript:doNothing()" mysubst="14" onClick="setDateField(parentNode.parentNode.parentNode.parentNode.parentNode.rcptdate);top.newWin = window.open('/ess/calendar.html', 'cal', 'dependent=yes, width=210, height=230, screenX=200, screenY=300, titlebar=yes')"><img SRC="/ess/calendar.gif" /></a></td>
          <td class="mileageLabel"><input type="text" name="recamt" onchange="if(CheckAmount(this.form.recamt)){calcBarterAmount(this.form);printTotals();setRepChgd()}else{this.form.recamt.value='';this.form.recamt.focus()}"></td>
          <td class="mileageRate1"><input readonly type="text" class="readonly" name="xrate" onchange="checkXRate(this.form);setRepChgd()"  /></td>
          <td class="mileageAmount1"><input readonly type="text" class="readonly" name="amount" onchange="amountVal(this.form.amount)" /></td>
          <td class="mileageProject1"><select id="project" name="refername" xref="refer" onChange="if(document.all) this.className='limited-width'; setRepChgd()" class="limited-width" onMouseDown="if(document.all) this.className='expanded-width';" onBlur="if(document.all) this.className='limited-width';" ></select></td>
          <td class="mileageLocation"><select type="text" name="locationname" xref="location" onChange="if(document.all) this.className='limited-width'; setRepChgd()" class="limited-width" onMouseDown="if(document.all) this.className='expanded-width';" onBlur="if(document.all) this.className='limited-width';" ></select></td>
          <td class="mileageFrom"><input type="text" name="xsource" onChange="setRepChgd()" > </td>
          <td class="mileageComment1"><input type="text" name="expense_1_comment" onKeyDown="setTabKey(event)"  onBlur="AddMilesAutomatic(this.form)" onChange="setRepChgd()"> </td>
          <td class="mileageDelete"><a href="javascript: doNothing()" onClick="removeThisForm(parentNode.parentNode.parentNode.parentNode.parentNode)"><span class="ExpenseLink">Delete</span></a></td>
        </tr>
      </table>
    </form>
    </span>
    
    <span id="extraMileage" style="display: none">
    <form name="screenMileage">
      <input type="hidden" name="rcpttype" value="4">
      <input type="hidden" name="expense_1_purpose" value="wizard">
      <input type="hidden" name="expense_1_xref" value>
      <input type="hidden" name="expense_1_expensetype" value>
      <input type="hidden" name="charge" value> 
      <input type="hidden" name="units" value>
      <input type="hidden" name="expense_1_billtype" value="No">
		<input type="hidden" name="okstatus" value>
		<input type="hidden" name="okref" value><input type="hidden" name="scanref" value>
      <input type="hidden" name="setPointer" value="No" subtype="nosave">
      <input type="hidden" name="persistance" value="" subtype="nosave">  
      <table cellspacing="0" cellpadding="0">
        <tr>
          <td class="mileageDate"><input type="text" name="rcptdate" value="" onChange="screenDate(rcptdate);setRepChgd()"  onBlur="getProperFgnRate(this.form)"><a HREF="javascript:doNothing()" mysubst="14" onClick="setDateField(parentNode.parentNode.parentNode.parentNode.parentNode.rcptdate);top.newWin = window.open('/ess/calendar.html', 'cal', 'dependent=yes, width=210, height=230, screenX=200, screenY=300, titlebar=yes')"><img SRC="/ess/calendar.gif" /></a></td>
          <td class="mileageLabel"><input type="text" name="recamt" onchange="if(CheckAmount(this.form.recamt)){calcBarterAmount(this.form);printTotals();setRepChgd()}else{this.form.recamt.value='';this.form.recamt.focus()}"></td>
          <td class="mileageRate1"><input readonly type="text" class="readonly" id="xrate" name="xrate" onchange="checkXRate(this.form);setRepChgd()" /></td>
          <td class="mileageAmount1"><input readonly type="text" class="readonly" name="amount" onchange="amountVal(this.form.amount);setRepChgd()" /></td>
          <td class="mileageProject1"><select id="project" name="refername" xref="refer" onChange="if(document.all) this.className='limited-width'; setRepChgd()" class="limited-width" onMouseDown="if(document.all) this.className='expanded-width';" onBlur="if(document.all) this.className='limited-width';" ></select></td>
          <td class="mileageLocation"><select name="locationname" xref="location" onChange="if(document.all) this.className='limited-width'; setRepChgd()" class="limited-width" onMouseDown="if(document.all) this.className='expanded-width';" onBlur="if(document.all) this.className='limited-width';" ></select></td>
          <td class="mileageFrom"><input type="text" name="xsource" onChange="setRepChgd()"> </td>
          <td class="mileageComment1"><input type="text" name="expense_1_comment" onKeyDown="setTabKey(event)" onBlur="AddMilesAutomatic(this.form)" onChange="setRepChgd()"> </td>
          <td class="mileageDelete"><a href="javascript: doNothing()" onClick="removeThisForm(parentNode.parentNode.parentNode.parentNode.parentNode)"><span class="ExpenseLink">Delete</span></a></td>
        </tr>
      </table>
    </form>
    </span>
    <a id="addMileage"></a>
</div>
<div id="mileageSectionOptions" class="formOptions">
	<span>add <a href="Javascript: void AddMilesViaLink()" onDblClick="screenDupFlagOK = false">Mileage</a></span>
</div>
<div id="mileageSectionHidden" class="reportSection" style="display:none;">
	<a class="titleForm" href="javascript: void showDataFields('mileageSection', showDataFields('mileageSectionOptions'), hideDataFields('mileageSectionHidden'))">Mileage</a>
    <div><a href="javascript: void showDataFields('mileageSection', showDataFields('mileageSectionOptions'), hideDataFields('mileageSectionHidden'))">click here <span>to open Mileage</span></a></div>
</div>


<div id="receiptSection" class="reportSection">
    <a class="titleForm" href="javascript: void hideDataFields('receiptSection', showDataFields('receiptSectionHidden'), hideDataFields('receiptSectionOptions'))">Expense Receipts</a>
    <table cellspacing="0" cellpadding="0">
      <thead>
		<tr>
        	<th class="receiptDate">Receipt date<span class="star">*</span></th>
        	<th class="amount"><span id="currencyLabel">amount</span></th>
        	<th class="foreignAmount">Foreign currency</th>
        	<th class="expenseType">Expense type<span class="star">*</span></th>
            <th class="receiptProject">Int. order</th>
            <th class="location">Location<span class="star">*</span></th>
	        <th class="comment">Comments</th>
        	<th class="delete" />
        	<th class="magnify" />
      	</tr>
      </thead>
    </table>
    <span id="defaultReceipt" class="offsetColor">
	<form name="screenReceipt">
		<input type="hidden" name="rcpttype" value="3">
		<input type="hidden" name="expense_1_attendeelist" value="[]">
		<input type="hidden" name="ratetype" value>
		<input type="hidden" name="xsource" value>
		<input type="hidden" name="units" value>      
		<input type="hidden" name="xrate" value>
		<input type="hidden" name="xdate" value>
		<input type="hidden" name="merchant" value>
		<input type="hidden" name="expense_1_persplit" value>
		<input type="hidden" name="expense_1_billtype" value="No">
		<input type="hidden" name="expense_1_purpose" value="wizard">
		<input type="hidden" name="expense_1_xref" value>
		<input type="hidden" name="charge" value>
		<input type="hidden" name="okstatus" value>
		<input type="hidden" name="okref" value><input type="hidden" name="scanref" value>
		<input type="hidden" name="setPointer" value="No" subtype="nosave">
		<input type="hidden" name="persistance" value="New" subtype="nosave">      
		<table cellspacing="0" cellpadding="0">
			<tr>
				<td class="receiptDate"><input type="text" name="rcptdate" value="" onChange="screenDate(rcptdate);setRepChgd()"><a HREF="javascript:doNothing()" onClick="setDateField(parentNode.parentNode.parentNode.parentNode.parentNode.rcptdate); top.newWin = window.open('/ess/calendar.html', 'cal', 'dependent=yes, width=210, height=230, screenX=200, screenY=300, titlebar=yes')"><img SRC="/ess/calendar.gif" /></a></td>
				<td class="amount"><input type="text" name="amount" value="" onChange="CheckAmount(this.form.amount);printTotals();setRepChgd()"></td>
				<td class="foreignAmount"><input type="text" name="recamt" value onChange="setFXFormObj(units.form);FXConvert();printTotals();setRepChgd()" readOnly="yes"><a href="javascript:doNothing()" onClick="setFXFormObj(parentNode.parentNode.parentNode.parentNode.parentNode.units.form);top.newWin = window.open('/ess/' + parent.language + '/fx1.html', 'fx', 'dependent=yes, width=650, height=450, screenX=500, screenY=400, titlebar=yes, status=yes')"><img title="currency" SRC="/ess/images/currency.gif" /></a></td>
				<td class="expenseType"><select name="expense_1_expensetypename" xref="expense_1_expensetype" class="limited-width" onMouseDown="if(document.all) this.className='expanded-width';" onBlur="if(document.all) this.className='limited-width';" onChange="applyInstruction(this.form);expTypeChange(this.form); if(document.all) this.className='limited-width';setRepChgd()"></select></td>
                <td class="receiptProject"><select id="project" name="refername" xref="refer" onChange="if(document.all) this.className='limited-width'; setRepChgd()" class="limited-width" onMouseDown="if(document.all) this.className='expanded-width';" onBlur="if(document.all) this.className='limited-width';"></select></td>
				<td class="location"><select name="locationname" xref="location" onChange="if(document.all) this.className='limited-width'; setRepChgd()" class="limited-width" onMouseDown="if(document.all) this.className='expanded-width';" onBlur="if(document.all) this.className='limited-width';"></select></td>
				<td class="comment"><input type="text" name="expense_1_comment" onChange="setRepChgd()"  onKeyDown="setTabKey(event)" onBlur="AddReceiptAutomatic(this.form)"><a href="javascript:doNothing()" onClick="initAttendeeList(parentNode.parentNode.parentNode.parentNode.parentNode.expense_1_attendeelist,parentNode.parentNode.parentNode.parentNode.parentNode.expense_1_persplit,parentNode.parentNode.parentNode.parentNode.parentNode.expense_1_expensetypename, 3); top.newWin = window.open('/ess/' + parent.language + '/attendee3c.html', 'attendee', 'dependent=yes, width=650, height=675, screenX=500, screenY=200, titlebar=yes, menubar=no, status=no, scrollbars=yes')"><img title="attendees" SRC="/ess/images/attendees.gif" /></a></td>
				<td class="delete"><a href="javascript:doNothing()" onClick="removeThisForm(parentNode.parentNode.parentNode.parentNode.parentNode)"><span class="ExpenseLink">Delete</span></a></td>
				<td class="magnify"><a name="magnify" ></a></td>
				</tr>
		</table>
    </form>
    </span>
    
    
    <span id="extraReceipt" style="display: none">
    <form name="screenReceipt">
		<input type="hidden" name="rcpttype" value="3">
		<input type="hidden" name="expense_1_attendeelist" value="[]">
		<input type="hidden" name="ratetype" value>
		<input type="hidden" name="xsource" value>
		<input type="hidden" name="units" value>      
		<input type="hidden" name="xrate" value>
		<input type="hidden" name="xdate" value>
		<input type="hidden" name="merchant" value>
		<input type="hidden" name="expense_1_persplit" value>
		<input type="hidden" name="expense_1_billtype" value="No">
		<input type="hidden" name="expense_1_purpose" value="wizard">
		<input type="hidden" name="expense_1_xref" value>
		<input type="hidden" name="charge" value>
		<input type="hidden" name="okstatus" value>
		<input type="hidden" name="okref" value><input type="hidden" name="scanref" value>
		<input type="hidden" name="setPointer" value="No" subtype="nosave">
		<input type="hidden" name="persistance" value="" subtype="nosave">
		<table cellspacing="0" cellpadding="0">
			<tr>
				<td class="receiptDate"><input type="text" name="rcptdate" value="" onChange="screenDate(rcptdate);setRepChgd()"><a HREF="javascript:doNothing()" onClick="setDateField(parentNode.parentNode.parentNode.parentNode.parentNode.rcptdate); top.newWin = window.open('/ess/calendar.html', 'cal', 'dependent=yes, width=210, height=230, screenX=200, screenY=300, titlebar=yes')"><img SRC="/ess/calendar.gif" /></a></td>
				<td class="amount"><input type="text" name="amount" value="" onChange="CheckAmount(this.form.amount);printTotals();setRepChgd()"></td>
				<td class="foreignAmount"><input type="text" name="recamt" value onChange="setFXFormObj(units.form);FXConvert();printTotals();setRepChgd()" readOnly="yes"><a href="javascript:doNothing()" onClick="setFXFormObj(parentNode.parentNode.parentNode.parentNode.parentNode.units.form);top.newWin = window.open('/ess/' + parent.language + '/fx1.html', 'fx', 'dependent=yes, width=650, height=450, screenX=500, screenY=400, titlebar=yes, status=yes')"><img title="currency" SRC="/ess/images/currency.gif" /></a></td>
				<td class="expenseType"><select name="expense_1_expensetypename" xref="expense_1_expensetype" class="limited-width" onMouseDown="if(document.all) this.className='expanded-width';" onBlur="if(document.all) this.className='limited-width';" onChange="applyInstruction(this.form);expTypeChange(this.form); if(document.all) this.className='limited-width';setRepChgd()"></select></td>
                <td class="receiptProject"><select id="project" name="refername" xref="refer" onChange="if(document.all) this.className='limited-width'; setRepChgd()" class="limited-width" onMouseDown="if(document.all) this.className='expanded-width';" onBlur="if(document.all) this.className='limited-width';" ></select></td>
				<td class="location"><select name="locationname" xref="location" onChange="if(document.all) this.className='limited-width'; setRepChgd()" class="limited-width" onMouseDown="if(document.all) this.className='expanded-width';" onBlur="if(document.all) this.className='limited-width';" ></select></td> 
				<td class="comment"><input type="text" name="expense_1_comment" onChange="setRepChgd()"  onKeyDown="setTabKey(event)" onBlur="AddReceiptAutomatic(this.form)"><a href="javascript:doNothing()" onClick="initAttendeeList(parentNode.parentNode.parentNode.parentNode.parentNode.expense_1_attendeelist,parentNode.parentNode.parentNode.parentNode.parentNode.expense_1_persplit,parentNode.parentNode.parentNode.parentNode.parentNode.expense_1_expensetypename,3); top.newWin = window.open('/ess/' + parent.language + '/attendee3c.html', 'attendee', 'dependent=yes, width=650, height=675, screenX=500, screenY=200, titlebar=yes, menubar=no, status=no, scrollbars=yes')"><img title="attendees" SRC="/ess/images/attendees.gif" /></a></td>
				<td class="delete"><a href="javascript:doNothing()" onClick="removeThisForm(parentNode.parentNode.parentNode.parentNode.parentNode)"><span class="ExpenseLink">Delete</span></a></td>
				<td class="magnify"><a name="magnify" ></a></td>
				</tr>
		</table>
    </form>
    </span>
    <a id="addReceipt"></a>
        <span id="extraHotel" style="display: none">
    <form name="screenHotel">
          <input type="hidden" name="rcpttype" value="3">
          <input type="hidden" name="subtype" value>
          <input type="hidden" name="expense_1_amount" value>
          <input type="hidden" name="expense_1_expdate" value>
          <input type="hidden" name="ratetype" value>
          <input type="hidden" name="xsource" value>
          <input type="hidden" name="units" value>      
          <input type="hidden" name="xrate" value>
          <input type="hidden" name="xdate" value>
          <input type="hidden" name="begdate" value>
          <input type="hidden" name="enddate" value>
          <input type="hidden" name="merchant" value>
          <input type="hidden" name="expense_1_persplit" value>
          <input type="hidden" name="expense_1_expensetype" value>
          <input type="hidden" name="expense_1_billtype" value="No">
          <input type="hidden" name="purpose" value="wizard">
          <input type="hidden" name="xref" value>
          <input type="hidden" name="location" value>
 
          <input type="hidden" name="charge" value>
          <input type="hidden" name="expense_1_attendeelist" value="[]">
          <input type="hidden" name="expenselist" subtype="hiddenlist" value="[]">
  			<input type="hidden" name="okstatus" value>
  			<input type="hidden" name="okref" value><input type="hidden" name="scanref" value>
          
          <input type="hidden" name="setPointer" value="No" subtype="nosave">
          <input type="hidden" name="persistance" value="" subtype="nosave">
    <table cellspacing="0" cellpadding="0">
       <tr class="hotelReceipt">
          <td class="receiptDate"><input type="text" name="rcptdate" readOnly="yes" class="readonly"></td>
          <td class="amount"><input type="text" name="amount" value="" readOnly="yes" class="readonly"></td>
          <td class="foreignAmount"><input type="text" name="recamt" readOnly="yes" class="readonly"></td>
          <td class="expenseType"><input type="text" name="lodgingtranslation" subtype="nosave" readOnly="yes" class="readonly"></td>
          <td class="receiptProject"><select id="project" name="refername" xref="refer" onChange="setRepChgd()"></select></td>
          <td class="location"><input name="locationname" readOnly="yes" class="readonly"></td>
          <td class="comment"><input type="text" name="expense_1_comment" readOnly="yes" class="readonly"></td>
          <td class="edit"><a href="javascript:doNothing()" onClick="parent.editHotelEntry(parentNode.parentNode.parentNode.parentNode.parentNode.setPointer)"><span class='ExpenseLink'>Edit</span></a></td>
          <td class="delete"><a href="javascript:doNothing()" onClick="removeThisForm(parentNode.parentNode.parentNode.parentNode.parentNode)"><span class="ExpenseLink">Delete</span></a></td>
          <td class="magnify"><a name="magnify" ></a></td>
          </tr>
    </table>
    </form>
    </span>
</div>
<div id="receiptSectionOptions" class="formOptions">
	<span>add <a href="Javascript: void AddRcptViaLink()" onDblClick="screenDupFlagOK = false">Another Receipt</a></span>
	<span>add <a class="ExpenseLink" id="addHotel" href="javascript: void loadHotelWizard()" onDblClick="screenDupFlagOK = false">Hotel Receipt</a></span>
</div>
<div id="receiptSectionHidden" class="reportSection" style="display:none;">
	<a class="titleForm" href="javascript: void showDataFields('receiptSection', showDataFields('receiptSectionOptions'), hideDataFields('receiptSectionHidden'))">Expense Receipts</a>
	<div><a href="javascript: void showDataFields('receiptSection', showDataFields('receiptSectionOptions'), hideDataFields('receiptSectionHidden'))">click here <span>to open Expense Receipts</span></a></div>
</div>

<div id="planeSection" class="reportSection">
    <a class="titleForm" href="javascript: void hideDataFields('planeSection', showDataFields('planeSectionHidden'), hideDataFields('planeSectionOptions'))">Airplane Receipt</a>
    <table cellspacing="0" cellpadding="0">
      <thead>
		<tr>
        	<th class="planeDate">Receipt date<span class="star">*</span></th>
        	<th class="planeAmount"><span id="currencyLabel">Amount</span></th>
        	<th class="planeForeignAmount">Foreign currency</th>
        	<th class="planeExpenseType">Expense type</th>
            <th class="planeProject">Int. order</th>
            <th class="planeLocation1">From<span class="star">*</span></th>
            <th class="planeLocation2">To<span class="star">*</span></th>
        	<th class="planeDelete" />
        	<th class="magnify" />
      	</tr>
      </thead>
    </table>
    
     <span id="defaultPlaneReceipt" class="offsetColor">
	<form name="screenPlaneReceipt">
		<input type="hidden" name="rcpttype" value="3">
		<input type="hidden" name="expense_1_attendeelist" value="[]">
		<input type="hidden" name="ratetype" value>
		<input type="hidden" name="xsource" value>
		<input type="hidden" name="units" value>      
		<input type="hidden" name="xrate" value>
		<input type="hidden" name="xdate" value>
		<input type="hidden" name="merchant" value>
		<input type="hidden" name="expense_1_persplit" value>
		<input type="hidden" name="expense_1_billtype" value="No">
		<input type="hidden" name="expense_1_expensetype" value>
        <input type="hidden" name="expense_1_purpose" value="wizard">
		<input type="hidden" name="expense_1_xref" value>
		<input type="hidden" name="charge" value>
		<input type="hidden" name="okstatus" value>
		<input type="hidden" name="okref" value><input type="hidden" name="scanref" value>

		<input type="hidden" name="setPointer" value="No" subtype="nosave">
		<input type="hidden" name="persistance" value="New" subtype="nosave">      
		<table cellspacing="0" cellpadding="0">
			<tr>
				<td class="planeDate"><input type="text" name="rcptdate" value="" onChange="screenDate(rcptdate);setRepChgd()"><a HREF="javascript:doNothing()" onClick="setDateField(parentNode.parentNode.parentNode.parentNode.parentNode.rcptdate); top.newWin = window.open('/ess/calendar.html', 'cal', 'dependent=yes, width=210, height=230, screenX=200, screenY=300, titlebar=yes')"><img SRC="/ess/calendar.gif" /></a></td>
				<td class="planeAmount"><input type="text" name="amount" value="" onChange="CheckAmount(this.form.amount);printTotals();setRepChgd()"></td>
				<td class="planeForeignAmount"><input type="text" name="recamt" value onChange="setFXFormObj(units.form);FXConvert();printTotals();setRepChgd()" readOnly="yes"><a href="javascript:doNothing()" onClick="setFXFormObj(parentNode.parentNode.parentNode.parentNode.parentNode.units.form);top.newWin = window.open('/ess/' + parent.language + '/fx1.html', 'fx', 'dependent=yes, width=650, height=450, screenX=580, screenY=400, titlebar=yes, status=yes')"><img title="currency" SRC="/ess/images/currency.gif" /></a></td>
				<td class="planeExpenseType"><input readonly type="text" class="readonly" name="planetranslation" value="AVION" subtype="nosave" /></td>
                <td class="planeProject"><select id="project" name="refername" xref="refer" onChange="if(document.all) this.className='limited-width'; setRepChgd()" class="limited-width" onMouseDown="if(document.all) this.className='expanded-width';" onBlur="if(document.all) this.className='limited-width';" ></select></td>
				<td class="planeLocation1"><select id="location" name="locationname" xref="location" onChange="if(document.all) this.className='limited-width'; setRepChgd()" class="limited-width" onMouseDown="if(document.all) this.className='expanded-width';" onBlur="if(document.all) this.className='limited-width';" ></select></td> 
                <td class="planeLocation2"><select name="offsetname" xref="offset" onChange="if(document.all) this.className='limited-width'; setRepChgd()" class="limited-width" onMouseDown="if(document.all) this.className='expanded-width';" onBlur="if(document.all) this.className='limited-width';" ></select></td>
				<td class="planeDelete"><a href="javascript:doNothing()" onClick="removeThisForm(parentNode.parentNode.parentNode.parentNode.parentNode)"><span class="ExpenseLink">Delete</span></a></td>
				<td class="magnify"><a name="magnify" ></a></td>
				</tr>
		</table>
    </form>
    </span>
    
    <span id="extraPlaneReceipt" style="display: none">
    <form name="screenPlaneReceipt">
		<input type="hidden" name="rcpttype" value="3">
		<input type="hidden" name="expense_1_attendeelist" value="[]">
		<input type="hidden" name="ratetype" value>
		<input type="hidden" name="xsource" value>
		<input type="hidden" name="units" value>      
		<input type="hidden" name="xrate" value>
		<input type="hidden" name="xdate" value>
		<input type="hidden" name="merchant" value>
		<input type="hidden" name="expense_1_persplit" value>
		<input type="hidden" name="expense_1_billtype" value="No">
		<input type="hidden" name="expense_1_expensetype" value>
        <input type="hidden" name="expense_1_purpose" value="wizard">
		<input type="hidden" name="expense_1_xref" value>
		<input type="hidden" name="charge" value>
		<input type="hidden" name="okstatus" value>
		<input type="hidden" name="okref" value><input type="hidden" name="scanref" value>

		<input type="hidden" name="setPointer" value="No" subtype="nosave">
		<input type="hidden" name="persistance" value="" subtype="nosave">
		<table cellspacing="0" cellpadding="0">
			<tr>
				<td class="planeDate"><input type="text" name="rcptdate" value="" onChange="screenDate(rcptdate);setRepChgd()"><a HREF="javascript:doNothing()" onClick="setDateField(parentNode.parentNode.parentNode.parentNode.parentNode.rcptdate); top.newWin = window.open('/ess/calendar.html', 'cal', 'dependent=yes, width=210, height=230, screenX=200, screenY=300, titlebar=yes')"><img SRC="/ess/calendar.gif" /></a></td>
				<td class="planeAmount"><input type="text" name="amount" value="" onChange="CheckAmount(this.form.amount);printTotals();setRepChgd()"></td>
				<td class="planeForeignAmount"><input type="text" name="recamt" value onChange="setFXFormObj(units.form);FXConvert();printTotals();setRepChgd()" readOnly="yes"><a href="javascript:doNothing()" onClick="setFXFormObj(parentNode.parentNode.parentNode.parentNode.parentNode.units.form);top.newWin = window.open('/ess/' + parent.language + '/fx1.html', 'fx', 'dependent=yes, width=650, height=450, screenX=580, screenY=400, titlebar=yes, status=yes')"><img title="currency" SRC="/ess/images/currency.gif" /></a></td>
				<td class="planeExpenseType"><input readonly type="text" class="readonly" name="planetranslation" value="AVION" subtype="nosave" /></td>
                <td class="planeProject"><select id="project" name="refername" xref="refer" onChange="if(document.all) this.className='limited-width'; setRepChgd()" class="limited-width" onMouseDown="if(document.all) this.className='expanded-width';" onBlur="if(document.all) this.className='limited-width';" ></select></td>
				<td class="planeLocation1"><select name="locationname" xref="location" onChange="if(document.all) this.className='limited-width'; setRepChgd()" class="limited-width" onMouseDown="if(document.all) this.className='expanded-width';" onBlur="if(document.all) this.className='limited-width';" ></select></td> 
                <td class="planeLocation2"><select name="offsetname" xref="offset" onChange="if(document.all) this.className='limited-width'; setRepChgd()" class="limited-width" onMouseDown="if(document.all) this.className='expanded-width';" onBlur="if(document.all) this.className='limited-width';" ></select></td> 
				<td class="planeDelete"><a href="javascript:doNothing()" onClick="removeThisForm(parentNode.parentNode.parentNode.parentNode.parentNode)"><span class="ExpenseLink">Delete</span></a></td>
				<td class="magnify"><a name="magnify" ></a></td>
				</tr>
		</table>
    </form>
    </span>
    <a id="addReceiptPlane"></a>
</div>
<div id="planeSectionOptions" class="formOptions">
	<span>add <a href="Javascript: void AddPlaneRcptViaLink()" onDblClick="screenDupFlagOK = false">Another Receipt</a></span>
</div>
<div id="planeSectionHidden" class="reportSection" style="display:none;">
	<a class="titleForm" href="javascript: void showDataFields('planeSection', showDataFields('planeSectionOptions'), hideDataFields('planeSectionHidden'))">Airplane Receipt</a>
	<div><a href="javascript: void showDataFields('planeSection', showDataFields('planeSectionOptions'), hideDataFields('planeSectionHidden'))">click here <span>to open Airplane Receipt</span></a></div>
</div>

<input id="btSave" type="button" value="Save" name=" "  onClick="javascript: void parent.loadHTMLScreenAJAX('saveXMLFile.html') " onDblClick="screenDupFlagOK = false">
<input id="btSaveSubmit" type="button" value="Save & Submit" name=" "  onClick="javascript: void loadHTMLScreenAJAX('submitWithGuide.html') " onDblClick="screenDupFlagOK = false">
<input id="cancelReport" type="button" value="Close without saving" name=" "  onClick="javascript: void cancelThisReport()" onDblClick="screenDupFlagOK = false">

<div id="totalDisplay">
      <table cellspacing="0" cellpadding="0">
      <thead>
		<tr>
        	<th>Report Total</th>
			<th>Non Reimbursables/Advances</th>
			<!--<th>Returned Funds</th>-->
           	<th class="tdLast">Due Employee</th>
      	</tr>
      </thead>
	  <tbody>
		<tr>
        	<td id="reportTotal">0.00</td>
			<td id="nonReimbAdvance">0.00</td>
        	<!--<td id="returnChk">0.00</td>-->
        	<td class="tdLast" id="reportTotalreturnChk">0.00</td>
      	</tr>
      </tbody>
    </table>
</div>

<span language="javascript" id="script" file="screen.js" load="screenLoad()" unload="screenUnload()" ></span>
