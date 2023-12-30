window.addEventListener('DOMContentLoaded', event => {
    // Simple-DataTables
    // https://github.com/fiduswriter/Simple-DataTables/wiki

    const datatablesSimple = document.getElementById('datatablesCongViec');
    if (datatablesSimple) {
        new simpleDatatables.DataTable(datatablesSimple, {
            // tableRender: (_data, table, type) => {
            //     if (type === "print") {
            //         return table
            //     }
            //     const tHead = table.childNodes[0]
            //     const filterHeaders = {
            //         nodeName: "TR",
            //         childNodes: tHead.childNodes[0].childNodes.map(
            //             (_th, index) => (
            //                 {nodeName: "TH",
            //                 childNodes: [
            //                     {
            //                         nodeName: "INPUT",
            //                         attributes: {
            //                             class: "datatable-input",
            //                             type: "search",
            //                             "data-columns": `[${index}]`
            //                         }
            //                     }
            //                 ]})
            //         )
            //     }
            //     tHead.childNodes.push(filterHeaders)
            //     return table
            // }
        });
    }
});
