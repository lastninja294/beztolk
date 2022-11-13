const tabMenuContainer = document.querySelectorAll(".print-tab-menu li");

tabMenuContainer.forEach((e) => {
  e.addEventListener("click", (elem) => {
    tabMenuContainer.forEach((e) => {
      e.classList.remove("active");
    });
    e.classList.add("active");
    console.log(e.getAttribute("data-tab-menu"));
    const element = document.querySelector(
      `.print-tab-content div[data-tab-content=${e.getAttribute(
        "data-tab-menu"
      )}]`
    );
    document.querySelectorAll(".print-tab-content div").forEach((e) => {
      e.classList.remove("view");
    });
    element.classList.add("view");
  });
});
