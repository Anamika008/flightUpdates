// function isExpanded(element) {
//   if (element.getAttribute("class") === "row collapse") return false;
//   return true;
// }

function isExpanded(element) {
  return !element.classList.contains("collapse");
}

function showContent(event) {
  // Get the clicked icon element
  let icon = event.target;
  //  find the closest row which needs to expanded and collapse
  let expand = icon.closest(".row").nextElementSibling;

  if (isExpanded(expand)) {
    expand.classList.add("collapse");
    icon.setAttribute("class", "fas fa-chevron-down toggle-content");
  } else {
    expand.classList.remove("collapse");
    icon.setAttribute("class", "fas fa-chevron-up toggle-content");
  }
}

// We can get all the element of the html using querySelector
// Suppose we need all element that has id, class, tagName
// var element = document.querySelector("id/class/tagName");
